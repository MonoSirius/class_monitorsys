package ustc.sse.student_class_status_monitor_sys.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ustc.sse.student_class_status_monitor_sys.interceptor.JWTInterceptor;

/**
 * student_class_status_monitor_sys
 *
 *  注册拦截器
 *
 * created by https://github.com/MonoSirius 16:54
 * copyright (c) USTC. All rights reserved.
 * 2022/11/2
 */
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                //拦截
                .addPathPatterns("/user/get/login")
                //放行
                .excludePathPatterns("/user/login");
    }
}
