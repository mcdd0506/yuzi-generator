package mcdd.cbq.maker.model;

import lombok.Data;

/**
 * MainTemplateConfig
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/8/14 20:25
 */
@Data
public class DataModel {

    /**
     * 是否 git
     */
    private Boolean needGit;

    /**
     * 是否循环
     */
    private Boolean loop;

    /**
     * 核心模板
     */
    public MainTemplate mainTemplate = new MainTemplate();

    /**
     * 用于生成核心模板文件
     */
    @Data
    public static class MainTemplate {
        /**
         * 作者注释
         */
        public String author = "yupi";

        /**
         * 输出信息
         */
        public String outputText = "sum = ";
    }


}
