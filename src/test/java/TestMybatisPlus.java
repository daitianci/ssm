import com.honor.ssm.entity.TUser;
import com.honor.ssm.service.ITUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-context.xml")
public class TestMybatisPlus {
    @Resource
    ITUserService userService;

    @Test
    public void testQuery(){
        List<TUser> users = userService.list();
        for (TUser user : users) {
            System.out.println(user);
        }
    }
}
