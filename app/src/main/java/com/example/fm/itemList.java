package com.example.fm;

public class itemList {
    private int idImg;
    private String title, content;

    public itemList(int idImg, String title, String content) {
        this.idImg = idImg;
        this.title = title;
        this.content = content;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
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

    public itemList() {
    }

}
