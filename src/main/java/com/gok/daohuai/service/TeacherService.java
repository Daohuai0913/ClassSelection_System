package com.gok.daohuai.service;

import com.gok.daohuai.mapper.StuMapper;
import com.gok.daohuai.mapper.TeacherMapper;
import com.gok.daohuai.pojo.Class;
import com.gok.daohuai.pojo.Student;
import com.gok.daohuai.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author huai
 * @date 2022/8/13
 */
public class TeacherService {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    public TeacherService() throws IOException {
    }


    public void login(Teacher teacher) {
        sqlSession.getMapper(TeacherMapper.class).getTeacherById(Integer.valueOf(teacher.getTeacherId()));
        if (teacher.getTeacherId().equals(sqlSession.getMapper(TeacherMapper.class).getTeacherById(Integer.valueOf(teacher.getTeacherId()))) &&
                teacher.getPassword().equals(sqlSession.getMapper(TeacherMapper.class).getPasswordById(Integer.valueOf(teacher.getPassword())))) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    public void register(Teacher teacher) {
        if (sqlSession.getMapper(TeacherMapper.class).checkTeacher(teacher.getTeacherName()) == 0) {
            sqlSession.getMapper(TeacherMapper.class).insertTeacher(teacher.getTeacherName(), teacher.getPassword(), teacher.getRealName(), teacher.getGender());
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }

    }

    public void register2(Teacher teacher){
        sqlSession.getMapper(TeacherMapper.class).insertTeacher(teacher.getTeacherName(), teacher.getPassword(), teacher.getRealName(), teacher.getGender());

    }

    public void showClass(Teacher teacher) {
        sqlSession.getMapper(TeacherMapper.class).showClass(Integer.parseInt(teacher.getTeacherId()));
    }

    public void addStudent(Student student,String teacherId) {
        sqlSession.getMapper(TeacherMapper.class).addStudent(student.getPhone(), student.getPhone(),student.getRealName(), student.getGender(), student.getAge(), teacherId);
    }

    public void updateStudent(Teacher teacher, Student student){
        if (teacher.getClassId() == student.getClassId()){
            sqlSession.getMapper(StuMapper.class).updateStudent(student.getRealName(), student.getPhone());
        }else {
            System.out.println("班级不一致");
        }
    }

    public void showStudent(Teacher teacher, Student student){
        sqlSession.getMapper(TeacherMapper.class).showStudent(teacher.getClassId(),student.getStudentId());
    }

    public void deleteStudent(Teacher teacher, Student student){
        sqlSession.getMapper(TeacherMapper.class).deleteStudent(student.getStudentId());
    }

    public void manage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to class selection system dear teacher");
        System.out.println("please choose your function");
        System.out.println("1.register");
        System.out.println("2.login");
        System.out.println("3.update your class information");
        System.out.println("4.show your class information");
        System.out.println("5.add student");
        System.out.println("6.delete student");
        System.out.println("7.show student information");
        System.out.println("8.update student information");
        System.out.println("9.quit");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("please input your teacherId");
                setTeacherId(sc.next());
                System.out.println("please input your teacherName");
                setTeacherName(sc.next());
                System.out.println("please input your password");
                setPassword(sc.next());
                System.out.println("please input your realname");
                setRealname(sc.next());
                new Teacher().register(teacherId,teacherName,password,realname);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                System.out.println("quit");
                System.exit(0);
                break;
            default:
                System.out.println("please input 1,2,3,4,5,6,7,8,9");
                break;
        }


    }




}

