package com.gok.daohuai.service;

import com.gok.daohuai.mapper.StuMapper;
import com.gok.daohuai.pojo.Student;
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

    public void showClass(String stuId) {
        sqlSession.getMapper(StuMapper.class).showClass(stuId);
    }

    Student student = new Student();

    public void manage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to class selection system dear teacher");
        System.out.println("please choose your function");
        System.out.println("1.login");
        System.out.println("2.show your information");
        System.out.println("3.change your password");
        System.out.println("4.show your class information");
        System.out.println("5.quit");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("please input your id");
                String stuId = sc.next();
                System.out.println("please input your password");
                String passwd = sc.next();
                login(stuId, passwd);

                break;
            case 2:
                System.out.println("please input your id");
                stuId = sc.next();
                showById(stuId);
                break;
            case 3:
                System.out.println("please input your id");
                stuId = sc.next();
                System.out.println("please input the password you want to change");
                passwd = sc.next();
                updatePasswd(stuId, passwd);
                break;
            case 4:
                System.out.println("please input your id");
                stuId = sc.next();
                showClass(stuId);
                break;
            case 5:
                System.out.println("quit");
                System.exit(0);
                break;
            default:
                System.out.println("please input 1,2,3,4,5,6,7,8,9");
                break;
        }


    }


}
