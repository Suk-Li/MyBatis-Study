package site.whatsblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.MyBatisUtils;

import java.util.List;

/**
 * <strong>
 * description : Mapper的测试类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/16 22:11</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class MapperTest {
    @Test
    public void testFindAll() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
    }
}
