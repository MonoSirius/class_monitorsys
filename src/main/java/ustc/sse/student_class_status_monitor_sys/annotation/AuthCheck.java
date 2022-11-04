package ustc.sse.student_class_status_monitor_sys.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 权限校验
 * <p>
 * student_class_status_monitor_sys
 * created by https://github.com/MonoSirius 11:10
 * copyright (c) USTC. All rights reserved.
 * 2022/10/27
 */
@Target(ElementType.METHOD) // 作用范围为方法
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    /**
     * 有任何一个角色
     *
     * @return
     */
    String[] anyRole() default "";

    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";
}
