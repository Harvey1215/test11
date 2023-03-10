import com.xhw.pojo.Orders;
import com.xhw.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class test1 {
    private SqlSession session;
    SqlSessionFactory sqlMapper;
    @Before
    public  void init(){
        String resources ="mybatis-config.xml";
        Reader reader =null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        session=sqlMapper.openSession();
    }

    @Test
    public void findUserOrders(){
        Users users=session.selectOne("findUserOrders",1);
        System.out.println(users);
    }

    @Test
    public void Find_Product_ById(){
        List<Orders>orders =session.selectList("Find_Product_ById",1);
        for(Orders orders1:orders){
            System.out.println(orders1);
        }

    }
    @After
    public void end(){
        session.commit();
        session.close();
    }
}
