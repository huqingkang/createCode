/*
package bigdata.flow.utils;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

*/
/**
 * Created by chun on 2017/3/13.
 *//*

public class JSONUtil {

    private static Gson gson = null;

    static{
        gson  = new Gson();//todo yyyy-MM-dd HH:mm:ss
    }

    public static synchronized Gson newInstance(){
        if(gson == null){
            gson =  new Gson();
        }
        return gson;
    }

    public static String toJson(Object obj){
        return gson.toJson(obj);
    }

    public static <T> T toBean(String json,Class<T> clz){

        return gson.fromJson(json, clz);
    }

    public static <T> Map<String, T> toMap(String json, Class<T> clz){
        Map<String, JsonObject> map = gson.fromJson(json, new TypeToken<Map<String,JsonObject>>(){}.getType());
        Map<String, T> result = new HashMap<>();
        for(String key:map.keySet()){
            result.put(key,gson.fromJson(map.get(key),clz) );
        }
        return result;
    }

    public static Map<String, Object> toMap(String json){
        Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String,Object>>(){}.getType());
        return map;
    }

    public static <T> List<T> toList(String json,Class<T> clz){
        JsonArray array = new JsonParser().parse(json).getAsJsonArray();
        List<T> list  = new ArrayList<>();
        for(final JsonElement elem : array){
            list.add(gson.fromJson(elem, clz));
        }
        return list;
    }
    */
/**
     * 将请求字符串格式化为Json
     * @param request
     * @return
     *//*

    public JSONObject formatToJson(HttpServletRequest request){
        Map<String, String[]> params = request.getParameterMap();
        Map<String, String> mapObject = new HashMap<>();
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                mapObject.put(key,value);
            }
        }
        return JSONObject.fromObject(mapObject);
    }
    public static Map parserToMap(String s){
        Map map=new HashMap();
        JSONObject json=JSONObject.fromObject(s);
        Iterator keys=json.keys();
        while(keys.hasNext()){
            String key=(String) keys.next();
            String value=json.get(key).toString();
            if(value.startsWith("{")&&value.endsWith("}")){
                map.put(key, parserToMap(value));
            }else{
                map.put(key, value);
            }

        }
        return map;
    }
}

*/
