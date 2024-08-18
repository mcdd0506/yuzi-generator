package mcdd.cbq.maker.template.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TemplateMakerModelConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/18 17:55
 */
@Data
public class TemplateMakerModelConfig {
    private List<ModelInfoConfig> models;

    private ModelGroupConfig modelGroupConfig;

    @NoArgsConstructor
    @Data
    public static class ModelInfoConfig {

        private String fieldName;

        private String type;

        private String description;

        private Object defaultValue;

        private String abbr;

        // 用于替换哪些文本
        private String replaceText;
    }

    @Data
    public static class ModelGroupConfig {

        private String condition;

        private String groupKey;

        private String groupName;
    }
}
