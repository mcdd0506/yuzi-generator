package mcdd.cbq.maker.template.model;

import lombok.Data;
import mcdd.cbq.maker.meta.Meta;

/**
 * TemplateMakerConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/18 19:08
 */
@Data
public class TemplateMakerConfig {

    private Long id;

    private Meta meta = new Meta();

    private String originProjectPath;

    TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();

    TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();
}
