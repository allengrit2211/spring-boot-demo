package com.example.demo.controller;

import com.example.demo.entity.Aa;
import com.example.demo.service.AaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorld {
    @Resource
    private AaService aaService;

    @RequestMapping(value = "sayHello")
    public String sayHello(){

        Aa aa = aaService.findCityById(13);

        System.out.println(aa);

        return "Hello,SpringBoot!";
    }


}
