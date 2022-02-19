package site.whatsblog.dao;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.MyBatisUtils;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/19 15:26</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class UserMapperTest extends TestCase {

    public void testFindUserById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
        User user2 = mapper.findUserById(2);
        System.out.println(user2);
        System.out.println(user==user2);
        sqlSession.close();
    }
    public void testUpdateUser() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
        sqlSession.close();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.findUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        sqlSession2.close();
    }
}