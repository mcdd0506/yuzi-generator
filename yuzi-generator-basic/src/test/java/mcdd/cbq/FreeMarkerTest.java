package mcdd.cbq;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FreeMarkerTest
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 20:13
 */
public class FreeMarkerTest {

    /**
     * FreeMarker 快速入门
     */
    @Test
    public void freeMarkerQuickstart() throws IOException, TemplateException {
        // step 1: new 出 Configuration 对象，参数为 FreeMarker 版本号，并指定版本文件所在路径和编码格式
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
        configuration.setDefaultEncoding("UTF-8");
        configuration.setNumberFormat("0.######");
        // step 2: 创建模板对象 并加载模板
        Template template = configuration.getTemplate("myweb.html.ftl");
        // step 3: 创建数据模型 (推荐使用 HashMap)
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("currentYear", 2023);
        List<Map<String, Object>> menuItems = new ArrayList<>();
        Map<String, Object> menuItem1 = new HashMap<>();
        menuItem1.put("url", "https://codefather.cn");
        menuItem1.put("label", "编程导航");
        Map<String, Object> menuItem2 = new HashMap<>();
        menuItem2.put("url", "https://laoyujianli.com");
        menuItem2.put("label", "老鱼简历");
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        dataModel.put("menuItems", menuItems);
        // step 4: 指定生成文件，并生成
        Writer writer = new FileWriter("myweb.html");
        template.process(dataModel,writer);
        writer.close();

    }
}
