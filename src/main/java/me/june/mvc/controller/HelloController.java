package me.june.mvc.controller;

import me.june.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return String.format("hello %s",helloService.getName());
    }

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }
}
