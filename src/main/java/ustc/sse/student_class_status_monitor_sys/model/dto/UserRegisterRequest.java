package ustc.sse.student_class_status_monitor_sys.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by https://github.com/MonoSirius 09:37
 * copyright (c) USTC. All rights reserved.
 * 2022/10/27
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userName;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
