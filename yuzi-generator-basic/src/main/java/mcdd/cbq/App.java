package mcdd.cbq;

import mcdd.cbq.cli.CommandExecutor;
import mcdd.cbq.generator.StaticGenerator;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);

//        staticAndDynamicDemo();

    }

    private static void staticAndDynamicDemo() {
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
