package com.gdns.xjrwgl.entities.hn;

/**
 * @author chenhf
 * @create: 2020-06-01 18:34
 * 湖南巡检任务记录关联
 */
public class CheckLog {

    private String id;
    //任务id
    private String taskId;
    //记录id
    private String logId;
    //生命周期
    private String lifestyle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    @Override
    public String toString() {
        return "CheckLog{" +
                "id='" + id + '\'' +
                ", taskId='" + taskId + '\'' +
                ", logId='" + logId + '\'' +
                ", lifestyle='" + lifestyle + '\'' +
                '}';
    }
}
