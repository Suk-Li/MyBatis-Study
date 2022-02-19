package site.whatsblog.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import site.whatsblog.pojo.Teacher;

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
    @Select("Select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid")int id);
}
