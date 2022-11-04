package ustc.sse.student_class_status_monitor_sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.model.entity.Emoji;
import ustc.sse.student_class_status_monitor_sys.model.enums.EmojiEnum;

import javax.servlet.http.HttpServletRequest;

/**
 * student_class_status_monitor_sys
 * 学生表情状态服务
 * created by https://github.com/MonoSirius 22:55
 * copyright (c) USTC. All rights reserved.
 * 2022/11/3
 */
@Service
public interface EmojiService extends IService<Emoji> {
    /**
     * 设置学生表情状态
     * 若已经设置则更新
     * 没有设置则插入
     *
     * @param rid 课堂记录id
     * @param emoji 表情状态
     * @param request 请求
     * @return 是否设置成功
     */
    boolean setEmoji(Long rid, int emoji, HttpServletRequest request);
}
