package mcdd.cbq.maker.template.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TemplateMakerFileConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/18 17:45
 */
@Data
public class TemplateMakerFileConfig {
    private List<FileInfoConfig> files;

    private FileGroupConfig fileGroupConfig;

    @NoArgsConstructor
    @Data
    public static class FileInfoConfig {

        private String path;

        private List<FileFilterConfig> filterConfigList;
    }

    @Data
    public static class FileGroupConfig {

        private String condition;

        private String groupKey;

        private String groupName;
    }
}
