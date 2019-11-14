package com.example.summachar;

public class Newsdata {
    private String headline;
    private int image;
    private String text;
    private String description;
    private String date;

    public Newsdata(String headline, int image, String text, String description, String date) {
        this.headline = headline;
        this.image = image;
        this.text = text;
        this.description = description;
        this.date = date;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
