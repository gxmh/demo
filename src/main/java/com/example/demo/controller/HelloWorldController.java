package com.example.demo.controller;

/**
 * Copyright(C),2019-2020,河南诚而升教育科技有限公司
 * FileName:HelloWorldController
 * Author:  GuoXu
 * Date:    2020/11/20 15:56
 * Description:
 * History:
 * <author>        <time>        <version>        <desc>
 * 作者姓名         修改时间        版本号            描述
 */


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! I am Spring Boot!";
    }
}
