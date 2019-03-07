import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honor.ssm.entity.TUser;
import com.honor.ssm.service.ITUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-context.xml")
public class TestMybatisPlus {
    @Autowired
    ITUserService userService;

    @Test
    public void testQueryByPage() {
        Integer page = 1;
        Integer rows = 10;
        //创建分页page对象
        IPage<TUser> iPage = new Page<>(page, rows);
        //创建过滤对象
        QueryWrapper<TUser> condition = new QueryWrapper<>();

        IPage<TUser> resoult = userService.page(iPage,condition);

        System.out.println(resoult);
    }
}
