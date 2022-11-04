package ustc.sse.student_class_status_monitor_sys.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 08:45
 * copyright (c) USTC. All rights reserved.
 * 2022/11/4
 */
@Data
public class EmojisSetRequest implements Serializable {
    /**
     * 开课记录号
     */
    private Long rid;

    /**
     * 表情状态
     */
    private Integer emoji;

    private static final long serialVersionUID = 1L;
}
