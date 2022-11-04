package ustc.sse.student_class_status_monitor_sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * student_class_status_monitor_sys
 * 开课记录
 * created by https://github.com/MonoSirius 09:22
 * copyright (c) USTC. All rights reserved.
 * 2022/11/4
 */
@TableName(value = "class_record")
@Data
public class ClassRecord implements Serializable {
    /**
     * 开课记录号
     */
    @TableId
    private Long rid;

    /**
     * 课程号
     */
    private Long cid;

    /**
     * 开课时间
     */
    private Date classTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
