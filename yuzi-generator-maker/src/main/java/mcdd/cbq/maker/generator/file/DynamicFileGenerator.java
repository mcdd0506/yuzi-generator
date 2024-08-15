package mcdd.cbq.maker.generator.file;

import cn.hutool.core.io.FileUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * DynamicFilesGenerator
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 20:30
 */
public class DynamicFileGenerator {

    /**
     * 生成
     *
     * @param inputPath  输入路径
     * @param outputPath 输出路径
     * @param model      模型
     */
    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
        // step 1: new 出 Configuration 对象，参数为 FreeMarker 版本号，并指定版本文件所在路径和编码格式
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setNumberFormat("0.######");
        // step 2: 创建模板对象 并加载模板
        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);

        if (!FileUtil.exist(outputPath)) {
            FileUtil.touch(outputPath);
        }

        // step 4: 指定生成文件，并生成
        Writer writer = new FileWriter(outputPath);
        template.process(model, writer);

        writer.close();

    }
}
