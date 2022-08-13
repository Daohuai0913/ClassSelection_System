package com.gok.daohuai.mapper;

import com.gok.daohuai.pojo.Class;
import com.gok.daohuai.pojo.Teacher;

import java.util.List;

/**
 * @author huai
 * @date 2022/8/13
 */
public interface TeacherMapper {
    Teacher getTeacherById(Integer id);

    String getPasswordById(Integer id);

    void insertTeacher(String teacherName, String password,String realName,String gender);

    int checkTeacher(String teacherName);

    List<Class> showClass(int teacherId);

    void addStudent(String passwd,String phone,String realName,String gender,String age,String teacherId);

    void showStudent(String classId,String stuId);

    void deleteStudent(String stuId);

}
