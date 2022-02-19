package site.whatsblog.dao;

import site.whatsblog.pojo.Student;

import java.util.List;

/**
 * <strong>
 * description : Student的Mapper接口
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 16:55</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface StudentMapper {
    List<Student> findAllStudent();
    List<Student> findAllStudent2();
}
