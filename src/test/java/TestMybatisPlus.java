import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honor.ssm.entity.TUser;
import com.honor.ssm.service.ITUserService;
import com.honor.ssm.webservice.Greeting;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
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

    @Test
    public void testClient(){
        try {
            JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
            factoryBean.setAddress("http://localhost:8080/ssm/webservice/Greeting?wsdl");
            factoryBean.setServiceClass(Greeting.class);//通过接口指定请求方法名称/返回类型/参数
            Greeting ex =(Greeting)factoryBean.create();

            Object object = ex.greeting("daitc");//请求完毕后、类型接收
            System.out.println(object.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
