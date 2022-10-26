package ustc.sse.student_class_status_monitor_sys.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ustc.sse.student_class_status_monitor_sys.model.User;

import java.util.List;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 21:10
 * copyright (c) USTC. All rights reserved.
 * 2022/10/25
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT INTO user(username, password, name, sex, age, phone)\n" +
            "VALUES (#{username}, #{password}, #{name}, #{sex}, #{age}, #{phone});")
    int insert(User user);
    int update(User user);
}
