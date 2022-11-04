package ustc.sse.student_class_status_monitor_sys.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by https://github.com/MonoSirius 10:53
 * copyright (c) USTC. All rights reserved.
 * 2022/10/27
 */
@Configuration
@MapperScan("ustc.sse.student_class_status_monitor_sys.mapper")
public class MybatisPlusConfig {
    /**
     * 拦截器配置
     *
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
