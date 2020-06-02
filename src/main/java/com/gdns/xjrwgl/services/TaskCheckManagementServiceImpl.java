package com.gdns.xjrwgl.services;

import com.gdns.xjrwgl.entities.hn.TaskCheck;
import com.gdns.xjrwgl.mapper.TaskCheckManagementMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author chenhf
 * @create: 2020-06-02 09:48
 */
@Service
public class TaskCheckManagementServiceImpl implements TaskCheckManagementService {
    private Logger log = LoggerFactory.getLogger(TaskCheckManagementServiceImpl.class);

    private TaskCheckManagementMapper tcmMapper;

    public TaskCheckManagementServiceImpl(TaskCheckManagementMapper tcmMapper){
        super();
        this.tcmMapper = tcmMapper;
    }

    @Override
    public String createTask(TaskCheck taskCheck) {
        log.info("正在创建巡检任务：[任务id:" + taskCheck.getId() +  ",任务名称：" + taskCheck.getName() + "]");
        tcmMapper.createTask(taskCheck);
        return taskCheck.getId();
    }

    @Override
    public String modifyTask(TaskCheck taskCheck) {
        log.info("正在修改巡检任务：[任务id:" + taskCheck.getId() +  ",任务名称：" + taskCheck.getName() + "]");
        tcmMapper.modifyTask(taskCheck);
        return taskCheck.getId();
    }

    @Override
    public String deleteTask(Integer id) {
        log.info("正在修改巡检任务：[任务id:" + id);
        tcmMapper.deleteTaskById(id);
        return id.toString();
    }
}
