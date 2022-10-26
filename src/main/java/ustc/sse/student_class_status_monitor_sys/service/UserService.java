package ustc.sse.student_class_status_monitor_sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 22:27
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@Service
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userName 用户名
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param userRole 用户角色
     * @return 新用户 id
     */
    long userRegister(String userName, String userAccount, String userPassword, String checkPassword, String userRole);

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 是否为管理员
     *
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);
}
