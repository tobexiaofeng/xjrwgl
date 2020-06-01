package com.gdns.xjrwgl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhf
 * @create: 2020-06-01 16:24
 */
@RestController
public class TaskCheckManagementController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
