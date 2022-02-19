package site.whatsblog.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * <strong>
 * description : 用户实体类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/14 22:30</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Alias("User")
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}
