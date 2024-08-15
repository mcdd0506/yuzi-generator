package mcdd.cbq.maker.cli.command;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;
import mcdd.cbq.maker.generator.file.FileGenerator;
import mcdd.cbq.maker.model.DataModel;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * GenerateCommand
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:51
 */
@Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    @Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否循环", interactive = true, echo = true)
    private boolean loop;
    @Option(names = {"-a", "--author"}, arity = "0..1", description = "作者", interactive = true, echo = true)
    private String author = "yupi";
    @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出文本", interactive = true, echo = true)
    private String outputText = "sum = ";

    @Override
    public Integer call() throws Exception {
        DataModel dataModel = new DataModel();
        BeanUtil.copyProperties(this, dataModel);
        System.out.println("配置信息 = " + dataModel);
        FileGenerator.doGenerate(dataModel);
        return 0;
    }
}
