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
     * 插入用户
     *
     * @param user 用户
     * @return 返回的行数
     */
    Integer addUser(User user);


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

    /**
     * 分页
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String, Integer> map);
    /**
     * 分页2
     * @param map
     * @return
     */
    List<User> getUserByRowBounds(Map<String, Integer> map);
}
