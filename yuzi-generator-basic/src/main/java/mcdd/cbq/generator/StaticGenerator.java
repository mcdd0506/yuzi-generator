package mcdd.cbq.generator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

/**
 * StaticGenerator
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 15:39
 */
public class StaticGenerator {

    /**
     * 拷贝文件 (Hutool 实现，将输入目录完整的拷贝到输出目录下）
     *
     * @param inputPath  输入目录
     * @param outputPath 输出目录
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

    public static void copyFilesByRecursion(String inputPath, String outputPath) {
        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);
        try {
            copyFileByRecursive(inputFile, outputFile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 递归拷贝
     * <br>
     * 文件 A => 目录 B 则 文件 A 放在目录 B 下
     * <br>
     * 文件 A => 文件 B 则 文件 A 覆盖文件 B
     * <br>
     * 目录 A => 目录 B 则 目录 A 放在目录 B 下
     * <br>
     * 核心思路：先创建目录，然后遍历目录内的文件，依次复制
     *
     * @param inputFile  输出文件
     * @param outputFile 输出文件
     * @throws IOException IOException
     */
    private static void copyFileByRecursive(File inputFile, File outputFile) throws IOException {
        // 区分是文件还是目录
        if (inputFile.isDirectory()) {
            System.out.println(inputFile.getName());
            File destOutputFile = new File(outputFile, inputFile.getName());
            // 如果是目录 首先创建目标目录
            if (!destOutputFile.exists()) {
                destOutputFile.mkdirs();
            }
            //获取目录下的所有文件和目录
            File[] files = inputFile.listFiles();
            //若无子文件 直接结束
            if (ArrayUtil.isEmpty(files)) {
                return;
            }
            for (File file : files) {
                //递归拷贝下一层文件
                copyFileByRecursive(file, destOutputFile);
            }
        } else {
            //是文件 直接复制到目标目录下
            Path destPath = outputFile.toPath().resolve(inputFile.getName());
            Files.copy(inputFile.toPath(), destPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
