package mcdd.cbq.maker.meta.enums;

/**
 * FileTypeEnum
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/15 20:04
 */
public enum FileTypeEnum {

    DIR("目录", "dir"),
    FILE("文件", "file"),
    GROUP("文件组", "group");


    private final String text;

    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}

