package com.test.rule.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class HttpclientUtil {
    private String baseUrl = "http://192.168.2.52:8080/cpp";
    private String loginUrl = "/login/interfaceLogin.html";
    /**
     * 字符串编码格式
     */
    public final static String CHARSET_NAME = "UTF-8";
    @Autowired
    private RestTemplate restTemplate;

    public static String test() throws Exception {
		String queryUrl = "http://192.168.2.52:8080/cpp/icqQueryApply/openQuery.do";
        String loginUrl = "http://192.168.2.52:8080/cpp/login/interfaceLogin.html";
//        String queryUrl = "http://192.168.2.52:8080/cpp/ecqQueryApply/openQuery.do";
        String loginoutUrl = "http://192.168.2.52:8080/cpp/login/interfaceLoginout.html";
        String paramJson = "{\"app_des\":\"interfaceTest20181225\","
                + "\"queryorg_code\":\"S10152050H0001\","
                + "\"qry_type\":\"0\","
                + "\"query_format\":\"30\","
                + "\"qtime_limit\":\"2019-12-25\","
                + "\"originate_orgcode\":\"S10152050H0001\","
                + "\"originate_usercode\":\"admin\","
                + "\"id_type\":\"10\","
                + "\"id_num\":\"123456789789456001\","
                + "\"client_ip\":\"9.1.60.84\","
                + "\"client_mac\":\"68-F7-28-56-F6-AA\","
                + "\"na_me\":\"小明\","
                + "\"query_reason\":\"01\","
                + "\"create_name\":\"01\","
                + "\"create_tor\":\"01\","
                + "\"query_reason\":\"01\","
                + "\"rek_user_name \":\"01\","
                + "\"query_reason\":\"01\","
                + "\"query_reason\":\"01\","
                + "\"query_reason\":\"01\","
                + "\"query_reason\":\"01\","
                + "\"service_code\":\"1233333\"}";


        String username = "test001";
        String password = "test001test001";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        int connectTimeout = 50000;
        int connectionRequestTimeout = 50000;
        int socketTimeout = 50000;

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(connectTimeout).setConnectionRequestTimeout(connectionRequestTimeout)
                .setSocketTimeout(socketTimeout).build();  //设置超时
        //登录
        HttpPost httpPost = new HttpPost(loginUrl);
        httpPost.setConfig(requestConfig);

        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("username", username));
        list.add(new BasicNameValuePair("password", password));

        UrlEncodedFormEntity entity1 = new UrlEncodedFormEntity(list, CHARSET_NAME);
        httpPost.setEntity(entity1);

        CloseableHttpResponse response = httpClient.execute(httpPost);//传参

        response.close();

        //发起查询
        httpPost = new HttpPost(queryUrl);
        httpPost.setConfig(requestConfig);

        List<NameValuePair> queryParamList = new ArrayList<NameValuePair>();

        queryParamList.add(new BasicNameValuePair("paramJson", paramJson));

        UrlEncodedFormEntity entity2 = new UrlEncodedFormEntity(queryParamList, CHARSET_NAME);
        httpPost.setEntity(entity2);

        response = httpClient.execute(httpPost);//传参

        String resultString = "";
        InputStream in = null;
        InputStreamReader bf = null;
        BufferedReader br = null;
        try {
            in = response.getEntity().getContent();
            bf = new InputStreamReader(in, CHARSET_NAME);
            br = new BufferedReader(bf);
            String str;
            while ((str = br.readLine()) != null) {
                resultString += str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                br.close();
                if (null != bf) {
                    bf.close();
                    if (null != in) {
                        in.close();
                    }
                }
            }
        }

        System.out.println(resultString);

        response.close();

        //退出登录
        httpPost = new HttpPost(loginoutUrl);
        httpPost.setConfig(requestConfig);
        response = httpClient.execute(httpPost);//传参

        return resultString;
    }

//    public String test2() {
//        String loginUrl = "http://192.168.2.52:8080/cpp/login/interfaceLogin.html";
//        String queryUrl = "http://192.168.2.52:8080/cpp/ecqQueryApply/openQuery.do";
//        String loginoutUrl = "http://192.168.2.52:8080/cpp/login/interfaceLoginout.html";
//        restTemplate.
//    }

    /**
     * 登录征信报告
     *
     * @return
     * @throws Exception
     */
    public ResponseEntity<String> login() throws Exception {
        String finalLoginUrl = baseUrl + loginUrl + "?username={username}&password={password}";
        log.info("登录路径{}", finalLoginUrl);
        Map<String, String> v = new HashMap<>();
//        v.put(OPUSERNAME, username);
//        v.put(PASSWORD, password);
        log.info("登录参数{}", v);
        return restTemplate.getForEntity(finalLoginUrl, String.class, v);
    }

    public static void main(String[] args) {

    }
}
