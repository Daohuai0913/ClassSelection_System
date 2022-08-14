package com.gok.daohuai.mapper;

import com.gok.daohuai.pojo.Student;
import com.gok.daohuai.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author huai
 * @date 2022/8/13
 */
public interface StuMapper {
    void updateStudent(String realName ,String phone,String studentId);

    void checkTeacher(Teacher teacher);

    List<Student> login(@Param("stuId") String stuId, @Param("passwd") String passwd);

    void showById(String stuId);

    void updatePasswd(String passwd,String stuId);

    void showClass(String classId);
}
