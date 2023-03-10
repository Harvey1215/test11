import com.xhw.pojo.mapper.userMapper;
import com.xhw.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Auther:bingli
 * ClassName:UserTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/2/19-02-19 21:44
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class UserTest {
    private SqlSession session;
    SqlSessionFactory sqlMapper;

    @Before
    public void init(){
    String resources = "mybatis-config.xml";
    //创建流
    Reader reader = null;
        try {
        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);
    } catch (IOException e) {
        e.printStackTrace();
    }
    //初始化mybatis数据库,创建SqlSessionFactory类的实例
     sqlMapper = new SqlSessionFactoryBuilder().build(reader);
    //创建SqlSession实例
     session=sqlMapper.openSession();
}
//    @Test
//    public void userFindByIdTest() {
//        //读取文件的名称
//        String resources = "mybatis-config.xml";
//        //创建流
//        Reader reader = null;
//        try {
//            //读取mybatis-config.xml文件内容到reader对象中
//            reader = Resources.getResourceAsReader(resources);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //初始化mybatis数据库,创建SqlSessionFactory类的实例
//        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
//        //创建SqlSession实例
//        SqlSession session = sqlMapper.openSession();
//        //传入参数查询，返回结果
//        user u=new user();
////        u.setUname("xhw");
//        u.setUid(2);
////        u.setUage(100);
//       // user user_s= session.selectOne("ifFind", u);
//        List <user>us_s=session.selectList("ifFind",u);
////        //输出结果
//        for(user i:us_s){
//            System.out.println(i.getUname());
//            System.out.println(i.getUage());
//            System.out.println(i.getUid());
//            System.out.println("==============================");
//
//        }
//
//        //关闭session
//        session.close();
//    }


@Test
//    public void update(){
//
//        SqlSession session = sqlMapper.openSession();
//         user u=new user();
//         u.setUname("update");
//         u.setUage(50);
//         u.setUid(2);
//
//         session.update("up_user",u);
////         System.out.println(session.update("up_user",u));
//
//    }
//    @Test
//    public void addUser(){
//        user use=new user();
//        use.setUage(20);
//        use.setUid(3);
//        use.setUname("insert");
//
//        String resources = "mybatis-config.xml";
//        //创建流
//        Reader reader = null;
//        try {
//            //读取mybatis-config.xml文件内容到reader对象中
//            reader = Resources.getResourceAsReader(resources);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //初始化mybatis数据库,创建SqlSessionFactory类的实例
//        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
//        //创建SqlSession实例
//        SqlSession session=sqlMapper.openSession();
//        System.out.println(session.insert("addUser",use));
//        session.commit();
//        session.close();
//    }
//@Test
//    public void updateUser()
//    {
//        String resources = "mybatis-config.xml";
//        //创建流
//        Reader reader = null;
//        try {
//            //读取mybatis-config.xml文件内容到reader对象中
//            reader = Resources.getResourceAsReader(resources);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //初始化mybatis数据库,创建SqlSessionFactory类的实例
//        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
//        //创建SqlSession实例
//        SqlSession session=sqlMapper.openSession();
//        user u=new user();
//        u.setUid(1);
//        u.setUage(100);
//        u.setUname("1111");
//        session.update("updateUser",u);
//        session.commit();
//        session.close();
//    }
    @After
    public void end(){
        session.commit();
        session.close();
    }


}