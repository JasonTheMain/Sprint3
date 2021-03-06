package com.banner.bannerApplication.entities;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.validation.constraints.AssertTrue;

import java.util.Set;
import java.util.HashSet;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_course", unique = true)
    private Long id;

    @OneToMany(mappedBy = "course")
    private Set<Section> sections = new HashSet<>();

    @Column(unique = true)
    private String courseName;

    @Column(unique = false)
    private String department;

    @Column(unique = false)
    private String number;

    @Column(unique = false)
    private int credits;

    @Column(unique = false)
    private String description;

    @Column(unique = false)
    private String learningObjective;

    @Column(unique = false)
    private String prereqs;

    @Column(unique = false)
    private String coreq;

    protected Course(){

    }
    public Course(String courseName,String department,String number,int credits,
                  String description,String learningObjective, String prereqs,
                   String coreq ){
        Assert.hasLength(courseName,"You need to Enter a Course Name");
        Assert.hasLength(department,"You need to Enter a Department");
        Assert.hasLength(number,"You need to Enter a Course Numerb");
        Assert.notNull(credits,"credits can't be null");
        if (credits > 6){
            throw new IllegalArgumentException();
        }
        Assert.hasLength(description,"Need a Description");
        Assert.hasLength(learningObjective,"Enter Objective of Course");
        this.courseName=courseName;
        this.department=department;
        this.number=number;
        this.credits=credits;
        this.description=description;
        this.learningObjective=learningObjective;
        this.prereqs=prereqs;
        this.coreq=coreq;
    }

    public Set<Section> getSections(){
        return sections;
    }

    public Long getCourseId() {
        return id;
    }

    public String getCoreq() {
        return coreq;
    }

    public void setCoreq(String coreq) {
        this.coreq = coreq;
    }

    public String getPrereqs() {

        return prereqs;
    }

    public void setPrereqs(String prereqs) {
        this.prereqs = prereqs;
    }

    public String getLearningObjective() {

        return learningObjective;
    }

    public void setLearningObjective(String learningObjective) {
        this.learningObjective = learningObjective;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {

        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}

