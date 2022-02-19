package dao;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import site.whatsblog.dao.UserMapper;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void testConnection() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void testPage() {
        SqlSession session = MyBatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> user = mapper.getUserByLimit(map);
        System.out.println(user);
        session.close();
    }
    @Test
    public void testPageRowBounds() {
        SqlSession session = MyBatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> users = session.selectList("site.whatsblog.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        System.out.println(users);
        session.close();
    }
}
