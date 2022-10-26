package ustc.sse.student_class_status_monitor_sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.mapper.UserMapper;
import ustc.sse.student_class_status_monitor_sys.model.User;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 22:27
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public int save(User user) {
        if (user.getUid() == null) {
            // insert
            return userMapper.insert(user);
        } else {
            return userMapper.update(user);
        }
    }
}
