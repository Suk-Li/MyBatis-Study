package site.whatsblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import site.whatsblog.pojo.User;
import site.whatsblog.utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <strong>
 * description : 测试UserDao
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/15 15:04</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class UserMapperTest {
    @Test
    public void test() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            // 方式一
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.getUsers();
        /*
            // 方式二
            List<User> userList = sqlSession.selectList("site.whatsblog.dao.UserMapper.getUsers");
        */
            System.out.println(users);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testFindUserById() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.findUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testFindUserById2() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id",2);
            map.put("username","Suk2");
            User user = userMapper.findUserById2(map);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testFindUserLike() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> user = userMapper.getUserLike("%");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testAddUser() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User("哈哈","2333333");
            Integer i = userMapper.addUser(user);
            if (i>0){
                sqlSession.commit();
            }else {
                sqlSession.rollback();
            }
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testAddUser2() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id",3);
            map.put("username","haha");
            map.put("password","23333");
            Integer i = userMapper.addUser2(map);
            if (i>0){
                sqlSession.commit();
            }else {
                sqlSession.rollback();
            }
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testUpdateUser() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(4,"哈哈哈哈","2333333");
            Integer i = userMapper.updateUser(user);
            if (i>0){
                sqlSession.commit();
            }else {
                sqlSession.rollback();
            }
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteUser() {
        // 获取SqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            // 执行SQL
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Integer i = userMapper.deleteUser(4);
            if (i>0){
                sqlSession.commit();
            }
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
