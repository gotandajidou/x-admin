package com.example;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/x_user";
        String username = "root";
        String password = "1234567890";
        String author = "wangzhenyuan";
        String outputDir = "/Users/wangzhenyuan/IdeaProjects/x-admin/src/main/java";
        String basePackage = "com.example";
        String moduleName = "sys";
        String mapperLocation = "/Users/wangzhenyuan/IdeaProjects/x-admin/src/main/resources/mapper" + moduleName;
        String tableName = "x_user";
        String tablePrefix = "x_";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author(author) 
                            //.enableSwagger() 
                            //.fileOverride() 
                            .outputDir(outputDir); 
                })
                .packageConfig(builder -> {
                    builder.parent(basePackage) 
                            .moduleName(moduleName) 
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); 
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableName) 
                            .addTablePrefix(tablePrefix); 
                })
                .templateEngine(new FreemarkerTemplateEngine()) 
                .execute();
    }

}
