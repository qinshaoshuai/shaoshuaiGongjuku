package com.qss.model;

public class TaiciBean {
    private Integer id;
    private String title;//标题
    private String content;//台词正文
    private String category;//分类：电视剧/电影 台词
    private String belongTo;//台词归属于哪部影视作品

    public TaiciBean() {
    }

    public TaiciBean(Integer id, String title, String content, String category, String belongTo) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.belongTo = belongTo;
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

    public String getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }
}
