package com.njucm.itf.dao;

import javax.persistence.*;

@Entity
@Table(name="Medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    //药材名称
    private String name;

    @Column(name="location")
    //产地
    private String location;

    @Column(name="sulfur")
    //含硫量
    private int sulfur;

    @Column(name="security")
    //安全性
    private int security;

    @Column(name="mix")
    //掺杂
    private int mix;

    @Column(name = "picpath")
    //图片路径
    private String picpath;

    @Column(name = "date")
    //鉴别时间
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSulfur() {
        return sulfur;
    }

    public void setSulfur(int sulfur) {
        this.sulfur = sulfur;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public int getMix() {
        return mix;
    }

    public void setMix(int mix) {
        this.mix = mix;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", sulfur=" + sulfur +
                ", security=" + security +
                ", mix=" + mix +
                ", picpath='" + picpath + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
