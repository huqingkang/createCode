package bigdata.uitools.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by buck on 2018/03/16.
 * @author buck wang
 */
public class ResponseUtil {
    private  static  String  encode = "UTF-8";

    public static String getEncode() {
        return encode;
    }

    /**
     *
     * @param encode
     */
    public static void setEncode(String encode) {
        ResponseUtil.encode = encode;
    }

    /**
     *
     * @param response
     * @param str
     * @throws IOException
     */
    public static void print(HttpServletResponse response, String  str) throws IOException {
        response.setContentType("text/html; charset="+encode);
        response.setHeader("Cache-Control", "no-cache");
        PrintWriter out=response.getWriter();
        out.println(str);
    }

    /**
     * response请求跨域公共设置
     * @param response
     * @return
     */
    public static HttpServletResponse setHttpServletResponse(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        return response;
    }
}
