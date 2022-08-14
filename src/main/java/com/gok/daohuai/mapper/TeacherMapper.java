package com.gok.daohuai.mapper;

import com.gok.daohuai.pojo.Class;
import com.gok.daohuai.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

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

    void showClass2(@Param("teacherId") int teacherId, @Param("classId") int classId);

    void addStudent(@Param("passwd") String passwd, @Param("realName") String realName, @Param("gender") String gender,@Param("age") String age, @Param("phone") String phone, @Param("classId") String classId);

    void showStudent(String classId,String stuId);

    void deleteStudent(String stuId);

    List<Class> showYourClass(String teacherId);

}
