package mcdd.cbq.maker.generator.main;

/**
 * MainGenerator
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/15 14:56
 */
public class MainGenerator extends GenerateTemplate{
    @Override
    protected void buildDist(String outputPath, buildScript result, String sourceCopyDestPath) {
        System.out.println("disable dist output model");
    }
}

