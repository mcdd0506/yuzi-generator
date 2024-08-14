package mcdd.cbq;

import mcdd.cbq.generator.StaticGenerator;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // 获取整个项目的根路径
        String projectPath = System.getProperty("user.dir");
        File parentFile = new File(projectPath).getParentFile();
        // 获取输入路径：ACM 示例代码模板目录
        String inputPath = new File(parentFile, "yuzi-generator-demo-projects/acm-template").getAbsolutePath();
        // 输出路径：直接输出到项目根目录
        StaticGenerator.copyFilesByRecursion(inputPath, projectPath);
//        StaticGenerator.copyFilesByHutool(inputPath, projectPath);

    }
}
