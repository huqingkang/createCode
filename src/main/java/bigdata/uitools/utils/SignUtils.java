/*
package bigdata.uitools.utils;


import net.sf.json.JSONObject;
import org.springframework.util.StringUtils;

import java.security.MessageDigest;
import java.util.*;

*/
/**
 * Created by Administrator on 2017/9/12.
 *//*

public class SignUtils {

    */
/**
     * 生成签名
     * @param map 生成签名参数
     * @return
     * @throws Exception
     *//*

    public static String getSign(Map<String,String> map) throws Exception{

        if(map.isEmpty()){
            return "";
        }
        List<String> keys = new ArrayList<>();
        keys.addAll(map.keySet());

        Collections.sort(keys, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1.toString().toLowerCase();
                String str2 = o2.toString().toLowerCase();
                return str1.compareTo(str2);
            }
        });

        StringBuffer url = new StringBuffer();
        for(String key : keys){
            if("sign".equals(key) || StringUtils.isEmpty(map.get(key))){
                continue;
            }
            if(url.length() > 0){
                url.append("&");
            }
            url.append(key+"="+map.get(key));
        }
        if(url.length() <=0){
            return "";
        }
        String result = MD5(url.toString()).toLowerCase();
        return result;
    }

    */
/**
     * 判断签名是否正确
     * @param params 生成签名参数
     * @param signStr 签名字符串
     * @return
     *//*

    public static boolean checkSign(Map<String,String> params, String signStr) {
        try {
            return getSign(params).equals(signStr);
        }catch (Exception e){
            return false;
        }
    }

    */
/**
     * 生成 MD5
     *
     * @param data 待处理数据
     * @return MD5结果
     *//*

    public static String MD5(String data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    */
/*public static void main(String[] args){
        userInfoDTO user = new userInfoDTO();
        user.setId("id");
        user.setEmail("email");
        user.setMobile("mobile");
        user.setUsername("username");

        JSONObject object = JSONObject.fromObject(user);
        System.out.print(object);
    }*//*

}
*/
