package com.gok.daohuai.pojo;

/**
 * @author huai
 * @date 2022/8/13
 */
public class Class {
    private String classId;
    private String grade;
    private String major;
    private String college;
    private String teacherId;
    private String classLeaderId;
//    班级学生人数
    private String sNumber;

    public Class(String classId, String grade, String major, String college, String teacherId, String classLeaderId, String sNumber) {
        this.classId = classId;
        this.grade = grade;
        this.major = major;
        this.college = college;
        this.teacherId = teacherId;
        this.classLeaderId = classLeaderId;
        this.sNumber = sNumber;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassLeaderId() {
        return classLeaderId;
    }

    public void setClassLeaderId(String classLeaderId) {
        this.classLeaderId = classLeaderId;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId='" + classId + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", college='" + college + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", classLeaderId='" + classLeaderId + '\'' +
                ", sNumber='" + sNumber + '\'' +
                '}';
    }
}
