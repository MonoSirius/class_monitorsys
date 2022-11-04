package ustc.sse.student_class_status_monitor_sys.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by https://github.com/MonoSirius 09:47
 * copyright (c) USTC. All rights reserved.
 * 2022/10/27
 */
@Data
public class UserAddRequest implements Serializable {
    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 用户角色: user, admin
     */
    private String userRole;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String phone;


    private static final long serialVersionUID = 1L;
}
