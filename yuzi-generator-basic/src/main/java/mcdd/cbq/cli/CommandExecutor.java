package mcdd.cbq.cli;


import mcdd.cbq.cli.command.ConfigCommand;
import mcdd.cbq.cli.command.GenerateCommand;
import mcdd.cbq.cli.command.ListCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * CommandExecutor
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:52
 */
@Command(name = "yuzi", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {
    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        System.out.println("请输入具体命令 或者输入 --help 查看命令提示");
    }

    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
