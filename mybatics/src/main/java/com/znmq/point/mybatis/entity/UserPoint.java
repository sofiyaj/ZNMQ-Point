package com.znmq.point.mybatis.entity;

/**
 * @author: Sofiya
 * @desc：用户积分表
 * @date: 2020-03-11 17:51:10
 * @Email：Sofiyaj@163.com
 * @url：
 */

public class UserPoint {
    private String user;
    private int id;
    private Long point;

    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Long getPoint(){
        return point;
    }
    public void setId(Long point){
        this.point = point;
    }

    UserPoint (int id){
        this.id = id;
    }

    public UserPoint(){}

    public UserPoint(int id,String user,Long point){
        this.id = id;
        this.user = user;
        this.point = point;
    }

    @Override
    public String toString(){
        return "user: " + user + " id: " + id + " point: " + point;

    }

}
