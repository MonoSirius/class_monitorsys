package ustc.sse.student_class_status_monitor_sys.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * student_class_status_monitor_sys
 * 返回学生表情统计信息
 * created by https://github.com/MonoSirius 08:51
 * copyright (c) USTC. All rights reserved.
 * 2022/11/4
 */
@Data
public class EmojiInfoVO implements Serializable {
    /**
     * 开课记录号
     */
    private Long rid;

    /**
     * 发送表情学生总人数
     */
    private Integer totalStudent;

    /**
     * 平均分数
     */
    private Integer average;

    /**
     * 分数方差
     */
    private Double variance;

    /**
     * 各分数段人数
     */
    private Integer[] studentByEmojiGroup;

    /**
     * 统计时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
