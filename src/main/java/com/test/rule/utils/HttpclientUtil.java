package cpp.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class HttpclientUtil {
    /** 字符串编码格式 */
    public final static String CHARSET_NAME = "UTF-8";

    public static void main(String[] args) throws Exception {
        String loginUrl = "http://localhost:8085/cpp/login/interfaceLogin.html";
//		String queryUrl = "http://localhost:8085/cpp/icqQueryApply/openQuery.do";
        String queryUrl = "http://localhost:8085/cpp/ecqQueryApply/openQuery.do";
        String loginoutUrl = "http://localhost:8085/cpp/login/interfaceLoginout.html";
//		String paramJson = "{\"app_des\":\"interfaceTest20181225\","
//							+"\"queryorg_code\":\"S10152050H0001\","
//							+"\"user_code\":\"111\","
//							+"\"pass_word\":\"d54ca11b21b9aedc05d94b234a3d2263e875e046ddc08631303a7f2a04d76ab1\","
//							+"\"qry_type\":\"0\","
//							+"\"query_format\":\"30\","
//							+"\"qtime_limit\":\"2019-12-25\","
//							+"\"originate_orgcode\":\"S10152050H0001\","
//							+"\"originate_usercode\":\"admin\","
//							+"\"id_type\":\"10\","
//							+"\"id_num\":\"123456789789456001\","
//							+"\"na_me\":\"小明\","
//							+"\"query_reason\":\"01\","
//							+"\"service_code\":\"1233333\"}";
        String paramJson = "{\"app_des\":\"interfaceTest20181225\","
                +"\"queryorg_code\":\"S10152050H0001\","
                +"\"user_code\":\"111\","
                +"\"pass_word\":\"d54ca11b21b9aedc05d94b234a3d2263e875e046ddc08631303a7f2a04d76ab1\","
                +"\"qry_type\":\"0\","
                +"\"query_format\":\"30\","
                +"\"qtime_limit\":\"2019-12-25\","
                +"\"originate_orgcode\":\"S10152050H0001\","
                +"\"originate_usercode\":\"admin\","
                +"\"id_type\":\"02\","
                +"\"id_num\":\"123456789789456122\","
                +"\"na_me\":\"企业征信查询监管授权申请\","
                +"\"query_reason\":\"10\","
                +"\"service_code\":\"1233333\"}";

        String username = "admin";
        String password = "123abc";

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

        UrlEncodedFormEntity entity1 = new UrlEncodedFormEntity(list,CHARSET_NAME);
        httpPost.setEntity(entity1);

        CloseableHttpResponse response = httpClient.execute(httpPost);//传参

        response.close();

        //发起查询
        httpPost = new HttpPost(queryUrl);
        httpPost.setConfig(requestConfig);

        List<NameValuePair> queryParamList = new ArrayList<NameValuePair>();

        queryParamList.add(new BasicNameValuePair("paramJson", paramJson));

        UrlEncodedFormEntity entity2 = new UrlEncodedFormEntity(queryParamList,CHARSET_NAME);
        httpPost.setEntity(entity2);

        response = httpClient.execute(httpPost);//传参

        String resultString = "";
        InputStream in = null;
        InputStreamReader bf = null;
        BufferedReader br = null;
        try {
            in = response.getEntity().getContent();
            bf = new InputStreamReader(in,CHARSET_NAME);
            br = new BufferedReader(bf);
            String str;
            while((str=br.readLine())!=null){
                resultString+=str;
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

//        String resultString = "";
//        InputStream in = null;
//        InputStreamReader bf = null;
//        BufferedReader br = null;
//        try {
//        	in = response.getEntity().getContent();
//        	bf = new InputStreamReader(in,CHARSET_NAME);
//        	br = new BufferedReader(bf);
//        	String str;
//        	while((str=br.readLine())!=null){
//        		resultString+=str;
//        	}
//        } catch (Exception e) {
//        	e.printStackTrace();
//        } finally {
//        	if (null != br) {
//        		br.close();
//        		if (null != bf) {
//        			bf.close();
//        			if (null != in) {
//        				in.close();
//        			}
//        		}
//        	}
//        }
//
//        System.out.println(resultString);
//		return resultString;
    }
}
