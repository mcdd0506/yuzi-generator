package mcdd.cbq.maker.meta.enums;

/**
 * ModelTypeEnum
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/15 20:05
 */
public enum ModelTypeEnum {

    STRING("字符串", "String"),
    BOOLEAN("布尔", "boolean");

    private final String text;

    private final String value;

    ModelTypeEnum(String text, String value) {
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

