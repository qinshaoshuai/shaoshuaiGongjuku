package com.qss.model;

public class SucaiBean {
    private Integer id;
    private String name;
    private String type;
    private String tag;

    public SucaiBean() {
    }

    public SucaiBean(Integer id, String name, String type, String tag) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
