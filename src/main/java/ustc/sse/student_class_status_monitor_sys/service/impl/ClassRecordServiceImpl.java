package ustc.sse.student_class_status_monitor_sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.common.ErrorCode;
import ustc.sse.student_class_status_monitor_sys.exception.BusinessException;
import ustc.sse.student_class_status_monitor_sys.mapper.ClassRecordMapper;
import ustc.sse.student_class_status_monitor_sys.model.entity.ClassRecord;
import ustc.sse.student_class_status_monitor_sys.service.ClassRecordService;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 09:42
 * copyright (c) USTC. All rights reserved.
 * 2022/11/4
 */
@Service
@Slf4j
public class ClassRecordServiceImpl extends ServiceImpl<ClassRecordMapper, ClassRecord> implements ClassRecordService {
    /**
     * 查询rid对应课程是否开课，即课堂记录是否存在
     * @param rid 课堂记录号
     * @return
     */
    @Override
    public boolean isBeginning(Long rid) {
        ClassRecord classRecord = this.getById(rid);
        // 查询是否开课
        return classRecord != null;
    }
}
