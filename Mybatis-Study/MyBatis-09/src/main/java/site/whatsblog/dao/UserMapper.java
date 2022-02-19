package site.whatsblog.dao;

import org.apache.ibatis.annotations.Param;
import site.whatsblog.pojo.User;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/19 15:23</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface UserMapper {
    /**
     * 查询用户
     * @param id id
     * @return 用户
     */
    User findUserById(@Param("id") int id);

    /**
     * 修改用户
     * @param user user
     * @return affectRows
     */
    int updateUser(User user);
}
