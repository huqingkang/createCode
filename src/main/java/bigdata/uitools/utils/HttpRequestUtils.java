/*
package bigdata.uitools.utils;


import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

*/
/**
 * Created by chun on 2017/2/24.
 *//*

@Component
public class HttpRequestUtils {

    private static Logger logger = LoggerFactory.getLogger(HttpRequestUtils.class);    //日志记录

    */
/**
     * 发送 get请求
     *
     * @param url
     * @return
     *//*

    public static JSONObject httpGet(String url) {
        JSONObject jsonResult = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = httpclient.execute(httpget);
            */
/**请求发送成功，并得到响应**//*

            if (response.getStatusLine().getStatusCode() == 200) {
                String strResult = EntityUtils.toString(response.getEntity());
                jsonResult = JSONObject.fromObject(strResult);
            } else {
                logger.error("get请求提交失败:" + url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonResult;
    }

    */
/**
     * post请求
     *
     * @param url       url地址
     * @param jsonParam 参数
     * @return
     *//*

    public static JSONObject httpPost(String url, JSONObject jsonParam) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        JSONObject jsonResult = null;
        HttpPost httppost = new HttpPost(url);
        try {
            if (null != jsonParam) {
                //解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");

                httppost.setEntity(entity);
            }
            CloseableHttpResponse response = httpclient.execute(httppost);
            url = URLDecoder.decode(url, "UTF-8");
            if (response.getStatusLine().getStatusCode() == 200) {
                try {
                    String str = EntityUtils.toString(response.getEntity());
                    jsonResult = JSONObject.fromObject(str);
                } catch (Exception e) {
                    // logger.error("post请求提交失败:" + url, e);
                    return null;
                }
            }
        } catch (IOException e) {
            logger.error("post请求提交失败:" + url, e);
        }
        return jsonResult;
    }

    */
/**
     * post请求
     *
     * @param url    url地址
     * @param params 参数
     * @return
     *//*

    public static JSONObject httpPost(String url, Map<String, String> params, Map<String, String> headerMap) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        JSONObject jsonResult = null;
        HttpPost httppost = new HttpPost(url);
        List<NameValuePair> param = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            param.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        if (headerMap != null && !headerMap.isEmpty()) {
            List<String> keyList = new ArrayList<>(headerMap.keySet());
            for (String key : keyList) {
                httppost.setHeader(key, headerMap.get(key));
            }
        }
        try {
            httppost.setEntity(new UrlEncodedFormEntity(param, "utf-8"));
            CloseableHttpResponse response = httpclient.execute(httppost);
            HttpEntity httpEntity = response.getEntity();
            String str = EntityUtils.toString(httpEntity);//取出应答字符串
            logger.info("resultString:" + str);
            jsonResult = JSONObject.fromObject(str);
        } catch (Exception e) {
            logger.error("post请求提交失败:" + url, e);
        }
        return jsonResult;
    }
}
*/
