package com.soft.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = "com.soft")
@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling
@MapperScan("com.soft.**.mapper")
class CmsServerApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(CmsServerApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ ICE启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  ___ ___ ___ ___ __  __ ___  \n" +
                "  |_ _/ __| __/ __|  \\/  / __| \n" +
                "  | | (__| _| (__| |\\/| \\__ \\ \n" +
                "  |___\\___|___\\___|_|  |_|___/ \n" +
                "  ''-'   `'-'    `-..-'            ");
    }

}
