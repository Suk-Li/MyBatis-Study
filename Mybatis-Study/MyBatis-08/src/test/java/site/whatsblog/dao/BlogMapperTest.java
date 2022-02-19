package site.whatsblog.dao;

import junit.framework.TestCase;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import site.whatsblog.pojo.Blog;
import site.whatsblog.utils.IDUtils;
import site.whatsblog.utils.MyBatisUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/2/18 22:40</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class BlogMapperTest extends TestCase {
    public void testAddBlog() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        try {
            mapper.addBlog(new Blog(IDUtils.getUUID(),"MyBatis第一天!","Suk",new Date(),0));
            mapper.addBlog(new Blog(IDUtils.getUUID(),"MyBatis第二天!","Suk",new Date(),0));
            mapper.addBlog(new Blog(IDUtils.getUUID(),"MyBatis第三天!","Suk",new Date(),0));
            mapper.addBlog(new Blog(IDUtils.getUUID(),"MyBatis第四天!","Suk",new Date(),0));
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
            session.close();
        }
    }

    public void testFindTest() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title","MyBatis第二天!");
        map.put("author","Suk");
        map.put("views","0");
        List<Blog> blogs = mapper.findBlogsByBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
    public void testUpdateBlog() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id","c96c5a4b431e492fb47b5b6a3feffc13");
        map.put("title","Hello World!!");
        map.put("author","Suk");
        map.put("views","1");
        int i  = 0;
        try {
            i = mapper.updateBlog(map);
            if (i>0){
                session.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            session.close();
        }
        System.out.println(i);
    }
}