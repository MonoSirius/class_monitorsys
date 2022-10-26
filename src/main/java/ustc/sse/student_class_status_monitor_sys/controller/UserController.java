package ustc.sse.student_class_status_monitor_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.sse.student_class_status_monitor_sys.mapper.UserMapper;
import ustc.sse.student_class_status_monitor_sys.model.User;
import ustc.sse.student_class_status_monitor_sys.service.UserService;

import java.util.List;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 21:33
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public int save(@RequestBody User user) {
        // 新增或者更新
        return userService.save(user);
    }
    @GetMapping("/user")
    public List<User> index2() {
        return userMapper.findAll();
    }
}
