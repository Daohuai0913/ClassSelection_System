package com.gok.daohuai.mapper;

import com.gok.daohuai.pojo.Teacher;

/**
 * @author huai
 * @date 2022/8/13
 */
public interface StuMapper {
    void updateStudent(String realName ,String phone,String studentId);

    void checkTeacher(Teacher teacher);

    void login(String stuId,String passwd);

    void showById(String stuId);

    void updatePasswd(String passwd,String stuId);

    void showClass(String classId);
}
