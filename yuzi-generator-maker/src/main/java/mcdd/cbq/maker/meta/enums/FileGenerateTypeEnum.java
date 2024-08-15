package mcdd.cbq.maker.meta.enums;

/**
 * FileGenerateTypeEnum
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/15 20:05
 */
/**
 * 文件生成类型枚举
 */
public enum FileGenerateTypeEnum {

    DYNAMIC("动态", "dynamic"),
    STATIC("静态", "static");

    private final String text;

    private final String value;

    FileGenerateTypeEnum(String text, String value) {
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


