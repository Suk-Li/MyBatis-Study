package site.whatsblog.pojo;

import lombok.Data;

import java.util.List;

/**
 * <strong>
 * description : Teacher实体类
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 16:53</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师拥有多个学生
    private List<Student> students;
}
