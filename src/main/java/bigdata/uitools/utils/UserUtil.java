/*
package bigdata.uitools.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

*/
/**
 * 用户信息token 判断
 * Created by Administrator on 2017/08/04.
 *//*

@Component
public class UserUtil {

    public final static String TOKEN_HEADER = "User-Token";

    private final static String USER_TOKEN_KEY = "bigdata:flow:token:";
    private final Logger log = LoggerFactory.getLogger(FlowServiceImpl.class);
    @Autowired
    HttpServletRequest request;

    @Autowired
    private UserAuth userAuth;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public String getUserIdByToken(String token) {
        userInfoDTO u = getUserInfo(token);

        return u == null ? "" : u.getId();
    }

    public String getUserNameByToken(String token) {
        userInfoDTO u = getUserInfo(token);
        return u == null ? "" : u.getUsername();
    }

    private userInfoDTO getUserInfo(String token) {
        String key = USER_TOKEN_KEY + token;
        String result = stringRedisTemplate.opsForValue().get(key);
        userInfoDTO u = null;

        if (result != null && !result.isEmpty()) {
            try {
                u = userInfoDTO.json2DTO(result);
            } catch (Exception ex) {
                u = null;
            }
        }


        if (u != null && u.getId() != null && !u.getId().isEmpty()) {
            stringRedisTemplate.opsForValue().set(key, result, 60 * 60, TimeUnit.SECONDS);
            return u;
        }

        try {
            result = userAuth.getAppAuth(token);

        } catch (Exception ex) {
            log.error("getAppAuth验证Token", ex);
        }
        if ("".equals(result)) {
            return null;
        }

        try {
            u = userInfoDTO.json2DTO(result);
        } catch (Exception ex) {
            u = null;
        }
        if (u == null || u.getId() == null || u.getId().isEmpty()) {
            return null;
        }
        stringRedisTemplate.opsForValue().set(key, result, 60 * 60, TimeUnit.SECONDS);
        return u;
    }

    public String getUserId() {
        String token = request.getHeader(TOKEN_HEADER);
        if (token == null || token.isEmpty()) {
            return "";
        }
        return getUserIdByToken(token);
    }
}
*/
