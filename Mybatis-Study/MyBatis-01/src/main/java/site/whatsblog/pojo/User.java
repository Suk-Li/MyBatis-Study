package site.whatsblog.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * <strong>
 * description : 用户实体类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/14 22:30</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
