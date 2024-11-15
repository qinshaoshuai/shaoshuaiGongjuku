package com.qss.model;

public class LingganBean {
    private Integer id;
    private String title;//标题
    private String content;//正文
    private String category;//分类
    private String remark;//备注

    public LingganBean() {
    }

    public LingganBean(Integer id, String title, String content, String category, String remark) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
