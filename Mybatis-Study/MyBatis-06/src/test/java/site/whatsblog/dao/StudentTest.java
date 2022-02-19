package site.whatsblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import site.whatsblog.pojo.Student;
import site.whatsblog.pojo.Teacher;
import site.whatsblog.utils.MyBatisUtils;

import java.util.List;

/**
 * <strong>
 * description : TeacherMapper测试类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 17:00</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class StudentTest {
    @Test
    public void testFindStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.findAllStudent2();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
