package com.king.demo.entity;

/**
 * Title:
 * Author: libinbin
 * Date: 2019/5/14 11:39
 */
public class Person {
    private long id;
    private String name;
    private String email;
    private int status;

    //getter  setter

    @Override
    public String toString(){
        return this.getId()+"---"+this.getName()+"---"+
                this.getEmail()+"---"+this.getStatus();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
