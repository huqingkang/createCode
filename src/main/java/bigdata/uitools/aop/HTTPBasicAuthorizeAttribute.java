package bigdata.uitools.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import javax.servlet.*;
import java.io.IOException;

@Component
public class HTTPBasicAuthorizeAttribute implements Filter,ApplicationContextAware{
    private static ApplicationContext ctx; // 必须声明为static

//    @Autowired
//    private UserUtil userUtil;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
