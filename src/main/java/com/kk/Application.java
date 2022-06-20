package com.kk;

import com.alibaba.fastjson.parser.ParserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        safemode 开启可以防护1.2.80 的rce 漏洞
        ParserConfig.getGlobalInstance().setSafeMode(true);

        SpringApplication.run(Application.class, args);
    }

}
