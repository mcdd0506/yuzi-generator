package mcdd.cbq.maker;

import freemarker.template.TemplateException;
import mcdd.cbq.maker.generator.main.MainGenerator;

import java.io.IOException;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}
