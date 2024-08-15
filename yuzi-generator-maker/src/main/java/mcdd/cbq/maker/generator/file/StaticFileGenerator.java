package mcdd.cbq.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * StaticGenerator
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 15:39
 */
public class StaticFileGenerator {

    /**
     * 拷贝文件 (Hutool 实现，将输入目录完整的拷贝到输出目录下）
     *
     * @param inputPath  输入目录
     * @param outputPath 输出目录
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }


}
