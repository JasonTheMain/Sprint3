package com.banner.bannerApplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String courseId;

    private String courseName;

 public void setId(String courseId){
     this.courseId=courseId;
    }
    public String getFirstName() {
        return courseName;
    }

    public void setFirstName(String courseName) {
        this.courseName = courseName;
    }

}
