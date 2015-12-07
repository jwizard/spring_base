package com.jwizard.mobileweb.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 2835 on 2015-10-30.
 */
@Component("webInterceptor ")
public class WebInterceptor extends HandlerInterceptorAdapter {

//    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=====preHandle=====");
        return true;
    }

    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView mav) throws Exception {
        System.out.println("=====postHandle=====");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        if (ex != null) {
            System.out.println("=====afterCompletion :" + ex);
        } else {
            System.out.println("=====afterCompletion clear");
        }
        super.afterCompletion(request, response, handler, ex);
    }
}
