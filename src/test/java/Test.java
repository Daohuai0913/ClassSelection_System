import com.gok.daohuai.mapper.TeacherMapper;
import com.gok.daohuai.pojo.Teacher;
import com.gok.daohuai.service.TeacherService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author huai
 * @date 2022/8/13
 */
public class Test {
    @org.junit.Test
    public void test() throws IOException {
        Teacher teacher = new Teacher();

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

//        sqlSession.getMapper(TeacherMapper.class).getTeacherById(Integer.valueOf(teacher.getTeacherId()));
//        sqlSession.getMapper(TeacherMapper.class).getTeacherById(1);
//        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacherById(1));

//        sqlSession.getMapper(TeacherMapper.class).getTeacherById(1);
//        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacherById(1).getPassword());
//        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacherById(1).getTeacherId());
        sqlSession.getMapper(TeacherMapper.class).showYourClass("1");
        System.out.println(sqlSession.getMapper(TeacherMapper.class).showYourClass("1").get(0).getClassId());

    }

//    public static void main(String[] args) throws IOException {
//        TeacherService teacherService = new TeacherService();
//
//    }
}
