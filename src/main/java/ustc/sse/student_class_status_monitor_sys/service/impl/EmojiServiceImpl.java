package ustc.sse.student_class_status_monitor_sys.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.common.ErrorCode;
import ustc.sse.student_class_status_monitor_sys.exception.BusinessException;
import ustc.sse.student_class_status_monitor_sys.mapper.EmojiMapper;
import ustc.sse.student_class_status_monitor_sys.model.entity.Emoji;
import ustc.sse.student_class_status_monitor_sys.service.EmojiService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 22:56
 * copyright (c) USTC. All rights reserved.
 * 2022/11/3
 */
@Service
@Slf4j
public class EmojiServiceImpl extends ServiceImpl<EmojiMapper, Emoji>
        implements EmojiService {

    @Resource
    private EmojiMapper emojiMapper;

    /**
     * 设置学生表情状态
     * 若已经设置则更新
     * 没有设置则插入
     *
     * @param rid     课堂记录id
     * @param emoji   表情状态
     * @param request 请求
     * @return 是否设置成功
     */
    @Override
    public boolean setEmoji(Long rid, int emoji, HttpServletRequest request) {
        // 1. 校验表情是否合法
        if (!(emoji > 0 && emoji <= 6)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "发送表情错误");
        }
        // 2. 从token中中解析id
        String token = request.getHeader("Authorization");
        if (token == null) {
            throw new BusinessException(ErrorCode.INVALID_TOKEN_ERROR);
        }
        DecodedJWT jwt = JWT.decode(token);
        Long userId = Long.parseLong(jwt.getClaim("id").asString());
        // 3. 查询表情状态,若没有则插入,否则进行更新
        Map<String, Object> params = new HashMap<String, Object>(){{
           put("rid", rid);
           put("id",userId);
        }};
        UpdateWrapper<Emoji> updateWrapper = new UpdateWrapper<>();
        Emoji emojiEntity = new Emoji(rid,userId,emoji);
        updateWrapper.allEq(params);
        updateWrapper.set("emoji", emojiEntity.getEmoji());
        return this.saveOrUpdate(emojiEntity, updateWrapper);
    }
}
