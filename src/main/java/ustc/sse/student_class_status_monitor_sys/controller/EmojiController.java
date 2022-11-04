package ustc.sse.student_class_status_monitor_sys.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ustc.sse.student_class_status_monitor_sys.common.BaseResponse;
import ustc.sse.student_class_status_monitor_sys.common.ErrorCode;
import ustc.sse.student_class_status_monitor_sys.common.ResultUtils;
import ustc.sse.student_class_status_monitor_sys.exception.BusinessException;
import ustc.sse.student_class_status_monitor_sys.model.dto.EmojisSetRequest;
import ustc.sse.student_class_status_monitor_sys.service.ClassRecordService;
import ustc.sse.student_class_status_monitor_sys.service.EmojiService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 22:54
 * copyright (c) USTC. All rights reserved.
 * 2022/11/3
 */
@RestController
@RequestMapping("/emoji")
public class EmojiController {

    @Resource
    private EmojiService emojiService;

    @Resource
    private ClassRecordService classRecordService;

    @PostMapping("/send")
    public BaseResponse<Boolean> setEmoji(@RequestBody EmojisSetRequest emojisSetRequest,
                                          HttpServletRequest request) {
        if (emojisSetRequest == null || emojisSetRequest.getRid() == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long rid = emojisSetRequest.getRid();
        // 检查是否开课
        if(!classRecordService.isBeginning(rid)) {
            throw new BusinessException(ErrorCode.NO_CLASS_ERROR);
        }
        boolean result = emojiService.setEmoji(rid, emojisSetRequest.getEmoji(),request);
        return ResultUtils.success(result);
    }
}
