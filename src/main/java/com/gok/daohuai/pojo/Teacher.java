package com.gok.daohuai.pojo;

/**
 * @author huai
 * @date 2022/8/13
 */
public class Teacher {
    private String teacherId;
    private String teacherName;
    private String password;
    private String realName;
    private String gender;

    private String classId;

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName, String password, String realName, String gender) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Teacher(String teacherName, String password, String realName, String gender) {
        this.teacherName = teacherName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
