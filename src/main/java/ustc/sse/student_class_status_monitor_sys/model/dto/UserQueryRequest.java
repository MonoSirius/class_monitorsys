package ustc.sse.student_class_status_monitor_sys.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ustc.sse.student_class_status_monitor_sys.common.PageRequest;

import java.io.Serializable;
import java.util.Date;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by https://github.com/MonoSirius 09:56
 * copyright (c) USTC. All rights reserved.
 * 2022/10/27
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
