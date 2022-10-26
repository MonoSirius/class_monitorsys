package ustc.sse.student_class_status_monitor_sys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 21:00
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@Data
@NoArgsConstructor
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String name;
    private String sex;
    private Integer age;
    private String phone;
}
