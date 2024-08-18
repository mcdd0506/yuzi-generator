package ${basePackage}.generator;

import ${basePackage}.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
* 核心生成器
*/
public class MainGenerator {

/**
* 生成
*
* @param model 数据模型
* @throws TemplateException
* @throws IOException
*/
public static void doGenerate(DataModel model) throws TemplateException, IOException {
String inputRootPath = "${fileConfig.inputRootPath}";
String outputRootPath = "${fileConfig.outputRootPath}";

String inputPath;
String outputPath;

<#-- 获取模型变量 -->
<#list modelConfig.models as modelInfo>
<#-- 有分组 -->
    <#if modelInfo.groupKey??>
        <#list modelInfo.models as subModelInfo>
            ${subModelInfo.type} ${subModelInfo.fieldName} = model.${modelInfo.groupKey}.${subModelInfo.fieldName};
        </#list>
    <#else>
        ${modelInfo.type} ${modelInfo.fieldName} = model.${modelInfo.fieldName};
    </#if>
</#list>


<#list fileConfig.files as fileInfo>
    <#if fileInfo.groupKey??>
        // groupKey = ${fileInfo.groupKey}
        <#if fileInfo.condition??>
            if(${fileInfo.condition}) {
            <#list fileInfo.files as fileInfo>
                inputPath = new File(inputRootPath, "${fileInfo.inputPath}").getAbsolutePath();
                outputPath = new File(outputRootPath, "${fileInfo.outputPath}").getAbsolutePath();
                <#if fileInfo.generateType == "static">
                    StaticGenerator.copyFilesByHutool(inputPath, outputPath);
                <#else>
                    DynamicGenerator.doGenerate(inputPath, outputPath, model);
                </#if>
            </#list>
            }
        <#else>
            <#list fileInfo.files as fileInfo>
                inputPath = new File(inputRootPath, "${fileInfo.inputPath}").getAbsolutePath();
                outputPath = new File(outputRootPath, "${fileInfo.outputPath}").getAbsolutePath();
                <#if fileInfo.generateType == "static">
                    StaticGenerator.copyFilesByHutool(inputPath, outputPath);
                <#else>
                    DynamicGenerator.doGenerate(inputPath, outputPath, model);
                </#if>
            </#list>
        </#if>
    <#else>
        <#if fileInfo.condition??>
            if(${fileInfo.condition}) {
            inputPath = new File(inputRootPath, "${fileInfo.inputPath}").getAbsolutePath();
            outputPath = new File(outputRootPath, "${fileInfo.outputPath}").getAbsolutePath();
            <#if fileInfo.generateType == "static">
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
            <#else>
                DynamicGenerator.doGenerate(inputPath, outputPath, model);
            </#if>
            }
        <#else>
            inputPath = new File(inputRootPath, "${fileInfo.inputPath}").getAbsolutePath();
            outputPath = new File(outputRootPath, "${fileInfo.outputPath}").getAbsolutePath();
            <#if fileInfo.generateType == "static">
                StaticGenerator.copyFilesByHutool(inputPath, outputPath);
            <#else>
                DynamicGenerator.doGenerate(inputPath, outputPath, model);
            </#if>
        </#if>
    </#if>
</#list>
}
}
