package com.gdns.xjrwgl.entities.hn;

/**
 * @author chenhf
 * @create: 2020-06-02 09:53
 */
public class ResponseWrapper <T> {
    /**
     * 状态编码
     */
    private Integer status;
    /**
     * 状态信息
     */
    private String info;
    /**
     * 包装类的相关信息
     */
    private T t;

    public ResponseWrapper() {
    }

    public ResponseWrapper(Integer status, String info) {
        this.status = status;
        this.info = info;
    }

    public ResponseWrapper(Integer status, String info, T t) {
        this.status = status;
        this.info = info;
        this.t = t;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
