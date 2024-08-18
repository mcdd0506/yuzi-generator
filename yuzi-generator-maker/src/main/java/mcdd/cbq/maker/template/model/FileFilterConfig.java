package mcdd.cbq.maker.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * FileFilterConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/18 17:44
 */
@Data
@Builder
public class FileFilterConfig {

    /**
     * 过滤范围
     */
    private String range;

    /**
     * 过滤规则
     */
    private String rule;

    /**
     * 过滤值
     */
    private String value;

}
