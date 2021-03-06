package com.example.week1_homework_1_newman;

import com.google.gson.annotations.SerializedName;

public class Post {

    public String title;
    @SerializedName("body")
    public String text;

    public int userId;

    public int id;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }
}
