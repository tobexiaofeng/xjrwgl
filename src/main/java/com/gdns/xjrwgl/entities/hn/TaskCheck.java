package com.gdns.xjrwgl.entities.hn;

import java.util.Date;

/**
 * @author chenhf
 * @create: 2020-06-01 16:53
 * 任务巡检
 */
public class TaskCheck {
    private String id;
    private String name;
    private String startTime;
    private String endTime;

    /**
     * 任务进度
     */
    private Integer taskRate;
    /**
     * 任务状态
     */
    private String taskStatus;
    /**
     * 地势ID
     */
    private String locationId;
    private String creator;
    private String createTime;
    private String lifestyle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getTaskRate() {
        return taskRate;
    }

    public void setTaskRate(Integer taskRate) {
        this.taskRate = taskRate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "TaskCheck{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", taskRate=" + taskRate +
                ", taskStatus='" + taskStatus + '\'' +
                ", locationId='" + locationId + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lifestyle='" + lifestyle + '\'' +
                '}';
    }
}
