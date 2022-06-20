package com.kk.domain;

import com.alibaba.fastjson.parser.ParserConfig;

import java.io.IOException;

public class Poc extends Exception{
    static {
        //        ParserConfig.getGlobalInstance().addAccept("com.kk.domain.Poc");
//        开启safemode 设置在这里第一次访问不生效，最好放置在springboot 启动类中，在Poc 类实例化前就开启
//        ParserConfig.getGlobalInstance().setSafeMode(true);

    }
    private String name;

    public void setName(String name) {
        this.name = name;
        try {
            Runtime.getRuntime().exec(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
