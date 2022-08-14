import com.gok.daohuai.pojo.Student;
import com.gok.daohuai.pojo.Teacher;
import com.gok.daohuai.service.StuService;
import com.gok.daohuai.service.TeacherService;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author huai
 * @date 2022/8/14
 * @description 学生选课系统
 */
public class CourseSelection {
    public static void main(String[] args) throws IOException {
        System.out.println("welcome to class selection system");
        System.out.println("please choose your Identify");
        System.out.println("1.student");
        System.out.println("2.teacher");
        System.out.println("3.quit");
        Scanner sc = new Scanner(System.in);
        while (true){
            switch (sc.nextInt()){
                case 1:
                    break;
                case 2:
                    new TeacherService().manage();
                    break;
                case 3:
                    System.out.println("quit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input 1,2,3");
                    break;
            }
        }
    }

}
