package ustc.sse.student_class_status_monitor_sys.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 22:49
 * copyright (c) USTC. All rights reserved.
 * 2022/10/26
 */
@Data
public class UserVO implements Serializable {
    /**
     * id
     */
    private Long id;

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
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */

    private Date updateTime;
    /**
     * token
     */
    private String token;

    private static final long serialVersionUID = 1L;
}
