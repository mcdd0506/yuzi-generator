package mcdd.cbq.model;

import lombok.Data;

/**
 * MainTemplateConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 20:25
 */
@Data
public class MainTemplateConfig {
    /**
     * 是否循环
     */
    private Boolean loop;
    /**
     * 作者注
     */
    private String author = "yupi";
    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
