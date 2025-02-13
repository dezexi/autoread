package com.example.database.models;

/*
* 配置信息
 */
public class MoocConfig {
    private int userid;
    private int readCount;
    private int readTime;
    private String userKey;

    /*
     set
     */
    public void setUserid(int uid){
        userid = uid;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public void setReadTime(int readTime) {
        this.readTime = readTime;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    /*
     get
     */
    public int getUserid(){
        return userid;
    }

    public int getReadCount() {
        return readCount;
    }

    public int getReadTime() {
        return readTime;
    }

    public String getUserKey() {
        return userKey;
    }
}
