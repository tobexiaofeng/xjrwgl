package com.gdns.xjrwgl.entities.hn;

/**
 * @author chenhf
 * @create: 2020-06-01 18:29
 * 湖南巡检设备状态
 */
public class EquipmentStatus {
    private String id;
    //设备id
    private String eId;
    //设备状态
    private String eStatus;
    //生命周期
    private String lifestyle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String geteStatus() {
        return eStatus;
    }

    public void seteStatus(String eStatus) {
        this.eStatus = eStatus;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    @Override
    public String toString() {
        return "EquipmentStatus{" +
                "id='" + id + '\'' +
                ", eId='" + eId + '\'' +
                ", eStatus='" + eStatus + '\'' +
                ", lifestyle='" + lifestyle + '\'' +
                '}';
    }
}
