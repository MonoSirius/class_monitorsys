package ustc.sse.student_class_status_monitor_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.sse.student_class_status_monitor_sys.mapper.UserMapper;
import ustc.sse.student_class_status_monitor_sys.model.entity.User;
import ustc.sse.student_class_status_monitor_sys.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 用户登录
     *
     * @param userLoginRequest
     * @param request
     * @return
     */


    @PostMapping("/save")
    public int save(@RequestBody User user) {
        // 新增或者更新
        return userService.save(user);
    }

    // 查询所有数据
    @PostMapping("/getUserList")
    public Map<String, Object> findAll() {
        List<User> items = userMapper.findAllNoPassword();
        Integer total = userMapper.selectTotal();
        Map<String, Object> res = new HashMap<>();
        res.put("items", items);
        res.put("total", total);
        return res;
    }

    // 删除数据
    @DeleteMapping("/{uid}")
    public int delete(@PathVariable Integer uid) {
        return userMapper.deleteByUid(uid);
    }

    // 分页查询
    // @RequestParam 接收  ?pageNum=1&pageSize=10
    // limit (pageNum - 1) * pageSize, pageSize
    @GetMapping("/getUserPage")
    public List<User> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        pageNum = (pageNum - 1) * pageSize;
        return userMapper.selectPage(pageNum, pageSize);
    }


}
