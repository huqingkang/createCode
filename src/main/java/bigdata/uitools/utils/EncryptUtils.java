package bigdata.uitools.utils;

import sun.misc.BASE64Decoder;

public class EncryptUtils {
    /**
     * base64 解密
     *
     * @param s
     * @return
     */
    public static String getFromBASE64(String s) {
        if (s == null){            return null;}
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }

}
