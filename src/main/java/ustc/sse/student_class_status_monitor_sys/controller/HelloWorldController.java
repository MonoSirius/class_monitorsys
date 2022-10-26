package ustc.sse.student_class_status_monitor_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ustc.sse.student_class_status_monitor_sys.mapper.UserMapper;
import ustc.sse.student_class_status_monitor_sys.model.User;

import java.util.List;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 20:42
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@RestController
public class HelloWorldController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/hello")
    public String index() {
        return "hello";
    }
    @GetMapping("/user")
    public List<User> index2() {
        return userMapper.findAll();
    }
}
