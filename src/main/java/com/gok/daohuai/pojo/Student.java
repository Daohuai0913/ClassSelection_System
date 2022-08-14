package com.gok.daohuai.pojo;

import com.mysql.cj.protocol.x.XProtocolRowInputStream;

/**
 * @author huai
 * @date 2022/8/13
 */
public class Student {
    private String studentId;
    private String passwd;
    private String realName;
    private String age;
    private String gender;
    private String phone;
    private String classId;

    public Student() {
    }

    public Student(String passwd, String realName, String age, String gender, String phone, String classId) {
        this.passwd = passwd;
        this.realName = realName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.classId = classId;
    }

    public Student(String studentId, String passwd, String realName, String age, String gender, String phone, String classId) {
        this.studentId = studentId;
        this.passwd = passwd;
        this.realName = realName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.classId = classId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", passwd='" + passwd + '\'' +
                ", realName='" + realName + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
