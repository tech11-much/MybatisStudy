import com.yang.dao.UserMapper;
import com.yang.pojo.User;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        User user = mapper.getUserById(1);
//        System.out.println(user);
//        sqlSession.close();
//        mapper.addUser(new User(6, "hello", "1111111111"));
//        mapper.updateUser(new User(5, "yang", "234565"));
        mapper.deleteUser(6);
        sqlSession.close();
    }
}
