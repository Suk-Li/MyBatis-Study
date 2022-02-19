package site.whatsblog.dao;

import site.whatsblog.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * <strong>
 * description : Blog的Mapper接口
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 22:31</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface BlogMapper {
    /**
     * 插入文章
     * @param blog
     * @return
     */
    int addBlog(Blog blog);

    /**
     * 查询Blog
     * @param map
     * @return
     */
    List<Blog> findBlogsByBlog(Map<String, Object> map);

    /**
     * 使用Choose查询
     * @param map
     * @return
     */
    List<Blog> findBlogsChoose(Map<String, Object> map);

    /**
     * 更新博客
     * @param map
     * @return
     */
    int updateBlog(Map<String, Object> map);
}
