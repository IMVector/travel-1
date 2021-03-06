package com.qdu.pojo;
// Generated 2019-4-9 19:55:57 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Essaycomment generated by hbm2java
 */
public class Essaycomment  implements java.io.Serializable {


     private Integer ecommentId;
     private Essay essay;
     private Userinfo userinfo;
     private String ecommentContent;
     private int ecommentScore;
     private Date ecommentTime;

    public Essaycomment() {
    }

    public Essaycomment(Essay essay, Userinfo userinfo, String ecommentContent, int ecommentScore, Date ecommentTime) {
       this.essay = essay;
       this.userinfo = userinfo;
       this.ecommentContent = ecommentContent;
       this.ecommentScore = ecommentScore;
       this.ecommentTime = ecommentTime;
    }
   
    public Integer getEcommentId() {
        return this.ecommentId;
    }
    
    public void setEcommentId(Integer ecommentId) {
        this.ecommentId = ecommentId;
    }
    public Essay getEssay() {
        return this.essay;
    }
    
    public void setEssay(Essay essay) {
        this.essay = essay;
    }
    public Userinfo getUserinfo() {
        return this.userinfo;
    }
    
    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }
    public String getEcommentContent() {
        return this.ecommentContent;
    }
    
    public void setEcommentContent(String ecommentContent) {
        this.ecommentContent = ecommentContent;
    }
    public int getEcommentScore() {
        return this.ecommentScore;
    }
    
    public void setEcommentScore(int ecommentScore) {
        this.ecommentScore = ecommentScore;
    }
    public Date getEcommentTime() {
        return this.ecommentTime;
    }
    
    public void setEcommentTime(Date ecommentTime) {
        this.ecommentTime = ecommentTime;
    }




}


