package com.gdns.xjrwgl.services;

import com.gdns.xjrwgl.entities.hn.TaskCheck;

/**
 * @author chenhf
 * @create: 2020-06-02 09:47
 */
public interface TaskCheckManagementService {

    /**
     * 创建巡检任务
     * @param taskCheck
     * @return 创建任务成功的任务id
     */
    public String createTask(TaskCheck taskCheck);

    /**
     * 修改巡检任务
     * @param taskCheck
     * @return 修改任务成功的任务id
     */
    public String modifyTask(TaskCheck taskCheck);

    /**
     * 删除巡检任务
     * @param id
     * @return 删除任务成功的任务id
     */
    public String deleteTask(Integer id);
}
