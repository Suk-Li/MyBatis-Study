package site.whatsblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.MyBatisUtils;

import java.util.List;

/**
 * <strong>
 * description : UserMapper测试类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/16 14:50</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class UserMapperTest {
    @Test
    public void testConnection() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
    }
}
