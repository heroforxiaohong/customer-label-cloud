package com.chinasofti.modules.test;

import com.alibaba.nacos.common.utils.UuidUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/todoSomething")
public class UrlTest {

    @GetMapping("/get")
    public String getTest(){
        String s = UuidUtils.generateUuid().replaceAll("-", "");
        return "测试成功！" + s ;
    }

}
