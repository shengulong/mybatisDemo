/**
 * Created by shendepu on 2017/1/9.
 */
import object.Tiger;
import org.apache.ibatis.session.*;
import java.io.IOException;
import org.apache.log4j.Logger;


public class Demo {

    public static  Logger logger = null;
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sessionFactory = MybatisUtil.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
          logger = Logger.getLogger(Demo.class);
          logger.debug("程序运行开始了");
          logger.info("提示信息");
        try {
            Tiger tiger = session.selectOne("selectTiger",1);
            System.out.println(tiger.getAge());
        } finally{
            session.close();
        }
        logger.debug("程序运行结束了");
        logger.warn("这个只是演示告警效果");
    }
}
