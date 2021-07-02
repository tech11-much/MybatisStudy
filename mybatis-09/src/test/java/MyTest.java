import com.yang.dao.UserMapper;
import com.yang.pojo.User;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void testOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();
//        int yang = mapper.updateUser(new User(2, "yang", "4555678765456"));
//        sqlSession.clearCache();
        User user1 = mapper2.queryUserById(1);
        System.out.println(user1);
        System.out.println(user == user1);
        sqlSession2.close();
    }
}
