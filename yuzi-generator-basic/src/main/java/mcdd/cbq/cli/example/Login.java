package mcdd.cbq.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * Login
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 21:22
 */
public class Login implements Callable<Integer> {
    @Option(names = {"-u", "--user"}, description = "User name")
    String user;

    // 设置了 arity 参数，可选交互式
    @Option(names = {"-p", "--password"}, arity = "0..1", description = "Passphrase", interactive = true)
    String password;

    // 设置了 arity 参数，可选交互式
    @Option(names = {"-cp", "--checkPassword"}, arity = "0..1", description = "Check Password", interactive = true)
    String checkPassword;

    public Integer call() throws Exception {
        System.out.println("user = " + user);
        System.out.println("password = " + password);
        System.out.println("checkPassword = " + checkPassword);
        return 0;
    }

    public static void main(String[] args) {
        new CommandLine(new Login()).execute("-u", "user123", "-p", "123", "-cp", "456");
    }
}
