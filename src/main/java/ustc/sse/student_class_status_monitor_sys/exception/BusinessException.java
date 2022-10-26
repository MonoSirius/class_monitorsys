package ustc.sse.student_class_status_monitor_sys.exception;

/**
 * student_class_status_monitor_sys
 * <p>
 * created by Monologue 23:11
 * copyright (c) USTC. All rights reserved.
 * 2022/10/26
 */
public class BusinessException extends RuntimeException {

    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
