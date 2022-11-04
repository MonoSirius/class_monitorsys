package ustc.sse.student_class_status_monitor_sys.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * student_class_status_monitor_sys
 * 学生课堂状态
 * created by https://github.com/MonoSirius 21:59
 * copyright (c) USTC. All rights reserved.
 * 2022/11/3
 */
@TableName(value = "emoji")
@Data
public class Emoji implements Serializable {
    /**
     * 课堂记录id
     */
    private Long rid;

    /**
     * 学生用户id
     */
    private Long id;

    /**
     * 表情状态
     * TODO：增加表情枚举类型
     */
    private Integer emoji;

    /**
     * 更新时间
     */
    private Date updateTime;
    @TableField(exist = false)
    private static final long serialVersionUID = 1434331L;


    public Emoji(Long rid, Long id, Integer emoji) {
        this.rid = rid;
        this.id = id;
        this.emoji = emoji;
    }
}
