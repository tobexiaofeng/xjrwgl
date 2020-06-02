package com.gdns.xjrwgl.mapper;

import com.gdns.xjrwgl.entities.hn.TaskCheck;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenhf
 * @create: 2020-06-02 09:10
 * 巡检任务管理
 */
public interface TaskCheckManagementMapper {

    /**
     * 新增巡检任务
     * @param taskCheck
     * @return
     */
    public int createTask(TaskCheck taskCheck);

    /**
     * 修改巡检任务
     * @param taskCheck
     * @return
     */
    public int modifyTask(TaskCheck taskCheck);

    /**
     * 删除巡检任务
     * @param id
     * @return
     */
    public int deleteTaskById(@Param("id") Integer id);

}
