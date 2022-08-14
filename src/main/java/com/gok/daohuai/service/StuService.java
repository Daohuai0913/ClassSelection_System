package com.gok.daohuai.service;

import com.gok.daohuai.mapper.StuMapper;
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
public class StuService {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    public StuService() throws IOException {
    }

    public void login(String stuId, String passwd) {
        sqlSession.getMapper(StuMapper.class).login(stuId, passwd);
    }

    public void showById(String stuId) {
        sqlSession.getMapper(StuMapper.class).showById(stuId);
    }

    public void updatePasswd(String stuId, String passwd) {
        sqlSession.getMapper(StuMapper.class).updatePasswd(stuId, passwd);
    }

    Student student = null;

//    public void manage() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("welcome to class selection system dear teacher");
//        System.out.println("please choose your function");
//        System.out.println("1.register");
//        System.out.println("2.login");
//        System.out.println("3.update your class information");
//        System.out.println("4.show your class information");
//        System.out.println("5.add student");
//        System.out.println("6.delete student");
//        System.out.println("7.show student information");
//        System.out.println("8.update student information");
//        System.out.println("9.quit");
//        switch (sc.nextInt()) {
//            case 1:
//                System.out.println("please input your teacherId");
//                student.setStudentId(sc.next());
//                sc.next();
//                System.out.println("please input your teacherName");
//                student.set
//                System.out.println("please input your password");
//                setPassword(sc.next());
//                System.out.println("please input your realname");
//                setRealname(sc.next());
//                new Teacher().register(teacherId,teacherName,password,realname);
//
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            case 8:
//                break;
//            case 9:
//                System.out.println("quit");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("please input 1,2,3,4,5,6,7,8,9");
//                break;
//        }
//
//
//    }


}
