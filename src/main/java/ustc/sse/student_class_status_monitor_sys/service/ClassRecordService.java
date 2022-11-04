package ustc.sse.student_class_status_monitor_sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import ustc.sse.student_class_status_monitor_sys.model.entity.ClassRecord;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 09:41
 * copyright (c) USTC. All rights reserved.
 * 2022/11/4
 */
@Service
public interface ClassRecordService extends IService<ClassRecord> {

    /**
     * 查询rid对应课程是否开课，即课堂记录是否存在
     * @param rid
     * @return
     */
    boolean isBeginning(Long rid);
}
