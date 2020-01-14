package com.test.rule.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author superman
 * @version 1.0
 * @date 2020/1/14 11:25
 */
@Slf4j
public class FileRead {

    private static final String DEFAULT_SEARCH_LOCATIONS = "classpath:/,classpath:/config/,file:./,file:./config/";

    public static byte[] readFileByResource(String filePath) {
        byte[] res = null;
        try {
            ResourceLoader resourceLoader = new DefaultResourceLoader();
            Set<String> loadOrderSet = asResolvedSet(",", DEFAULT_SEARCH_LOCATIONS);
            InputStream is1 = null;
            for (String loadOrder : loadOrderSet) {
                if (resourceLoader.getResource(loadOrder + filePath).exists()) {
                    try {
                        is1 = resourceLoader.getResource(loadOrder + filePath).getInputStream();
                        break;
                    } catch (IOException e) {
                        log.error("文件读取异常", e);
                        return null;
                    }
                }
            }
            if (is1 == null) {
                log.error("文件为空");
                return null;
            }
            int fileLength = is1.available();
            res = fileLength > 0L ? IOUtils.toByteArray(is1, fileLength) : IOUtils.toByteArray(is1);
        } catch (IOException e) {
            log.error("通过resource获取文本内容失败 Exception：" + e);
        }
        return res;
    }

    private static Set<String> asResolvedSet(String value, String fallback) {
        List<String> list = Arrays.asList(StringUtils.split(fallback, value));
        Collections.reverse(list);
        return new LinkedHashSet<>(list);
    }

    public static void main(String[] args) throws IOException {
        List<String> list = FileUtils.readLines(new File("C:\\Users\\superman\\Desktop\\二代征信接口\\张某某.xml"), "utf-8");
        for (String s : list) {
            if(!s.endsWith(">")){
                System.out.println(s);
            }
        }
    }
}
