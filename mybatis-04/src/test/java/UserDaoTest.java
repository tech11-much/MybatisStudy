import com.yang.dao.UserMapper;
import com.yang.pojo.User;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test(){
        //第一步：获取
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("进入方法成功");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);

        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("进行了日志打印");
        logger.debug("进行了日志打印");
        logger.error("进行了日志打印");
    }

    @Test
    public void getListByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("进入方法成功");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 3);
        List<User> list = mapper.getListByLimit(map);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //增删改需要提交事务
//    @Test
//    public void addUser(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int res = mapper.addUser(new User(4, "yanghechuan", "1234567890"));
//        if(res > 0){
//            System.out.println("增加成功");
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    //map传递参数，直接在语句中使用key即可
//    @Test
//    public void addUserOne(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("userId", 5);
//        map.put("userName", "hhhh");
//        map.put("passWord", 63637278);
//        //提交事务
//        mapper.addUserOne(map);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    //修改数据
//    @Test
//    public void updateUser(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int res = mapper.updateUser(new User(4, "yanghen", "12390"));
//        if(res > 0){
//            System.out.println("修改成功");
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    //删除一个用户
//    @Test
//    public void deleteUser(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int res = mapper.deleteUser(5);
//        if(res > 0){
//            System.out.println("删除成功");
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void getUserLike(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> list = mapper.getUserLike("%yan%");
//        for (User user : list) {
//            System.out.println(user);
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
}
