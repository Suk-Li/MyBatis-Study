package site.whatsblog.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import site.whatsblog.pojo.Teacher;

import java.util.List;

/**
 * <strong>
 * description : Teacher的Mapper接口
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 16:55</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface TeacherMapper {
    /**
     * 获取所有老师
     * @return 老师List
     */
    List<Teacher> findAllTeachers();

    /**
     * 获取指定老师下的所有学生及老师的信息
     * @param id 老师id
     * @return 老师和学生信息
     */
    Teacher findTeacherById(@Param("id") int id);
    Teacher findTeacherById2(@Param("id") int id);
}
