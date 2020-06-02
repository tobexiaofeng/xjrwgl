package com.gdns.xjrwgl.controller;

import com.gdns.xjrwgl.entities.hn.ResponseWrapper;
import com.gdns.xjrwgl.entities.hn.TaskCheck;
import com.gdns.xjrwgl.services.TaskCheckManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenhf
 * @create: 2020-06-01 16:24
 */
@RestController
public class TaskCheckManagementController {
    private TaskCheckManagementService tcmService;

    public TaskCheckManagementController(TaskCheckManagementService tcmService){
        super();
        this.tcmService = tcmService;
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/create")
    public ResponseWrapper createTask(TaskCheck taskCheck){
        tcmService.createTask(taskCheck);
        return new ResponseWrapper(1,"success");
    }

    @PostMapping("/update")
    public ResponseWrapper modifyTask(TaskCheck taskCheck){
        tcmService.modifyTask(taskCheck);
        return new ResponseWrapper(1,"success");
    }

    @GetMapping("/delete/{id}")
    public ResponseWrapper deleteTask(@PathVariable("id") Integer id){
        tcmService.deleteTask(id);
        return new ResponseWrapper(1,"success");
    }
}
