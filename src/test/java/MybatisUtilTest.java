import org.testng.annotations.*;

public class MybatisUtilTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("this is another before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is another TestNG test case");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is another after class");
    }

}