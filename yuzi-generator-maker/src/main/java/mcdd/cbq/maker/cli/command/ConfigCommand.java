package mcdd.cbq.maker.cli.command;

import cn.hutool.core.util.ReflectUtil;
import mcdd.cbq.maker.model.DataModel;
import picocli.CommandLine.Command;

import java.lang.reflect.Field;

/**
 * ConfigCommand
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:51
 */
@Command(name = "config", description = "查看参数信息", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {

    @Override
    public void run() {
        // 实现 config 命令的逻辑
        System.out.println("查看参数信息");

/*      // 获取要打印属性信息的类
        Class<?> myClass = MainTemplateConfig.class;
        // 获取类的所有字段
        Field[] fields = myClass.getDeclaredFields();*/

        Field[] fields = ReflectUtil.getFields(DataModel.class);

        // 遍历并打印每个字段的信息
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName());
            System.out.println("字段类型：" + field.getType());
//          System.out.println("Modifiers: " + java.lang.reflect.Modifier.toString(field.getModifiers()));
            System.out.println("---");
        }
    }
}
