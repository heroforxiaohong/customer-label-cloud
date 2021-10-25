package com.chinasofti.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringCloudApplication
@EnableAspectJAutoProxy
public class CustomerLabelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerLabelApplication.class,args);
        System.out.println("客户标签系统启动成功！");
    }

}
