package site.whatsblog.dao;

import site.whatsblog.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * <strong>
 * description : 用户的持久层接口
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/14 22:35</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface UserMapper {
    List<User> getUserLike(String value);

    /**
     * 查询所有
     *
     * @return UserList
     */
    List<User> getUsers();

    /**
     * 根据id查询用户
     *
     * @param id id
     * @return 用户
     */
    User findUserById(Integer id);

    /**
     * 根据id查询用户
     *
     * @param map id
     * @return 用户
     */
    User findUserById2(Map<String, Object> map);

    /**
     * 插入用户
     *
     * @param user 用户
     * @return 返回的行数
     */
    Integer addUser(User user);

    /**
     * 添加用户，万能的Map
     * @param map 用户信息
     * @return
     */
    Integer addUser2(Map<String, Object> map);

    /**
     * 修改用户
     *
     * @param user 用户
     * @return 返回的行数
     */
    Integer updateUser(User user);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 返回的行数
     */
    Integer deleteUser(Integer id);
}
