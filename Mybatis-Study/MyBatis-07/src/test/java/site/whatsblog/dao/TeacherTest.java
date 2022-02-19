package site.whatsblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
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
public class TeacherTest {
    @Test
    public void testFindTeacher() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.findAllTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    @Test
    public void testFindTeacher2() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.findTeacherById2(1);
        System.out.println(teacher);
    }
}
