package ustc.sse.student_class_status_monitor_sys.model.enums;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 22:08
 * copyright (c) USTC. All rights reserved.
 * 2022/11/3
 */
public enum EmojiEnum {
    EMOJI_1(1), EMOJI_2(2), EMOJI_3(3),
    EMOJI_4(4), EMOJI_5(5), EMOJI_6(6);
    private final int value;

    EmojiEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
