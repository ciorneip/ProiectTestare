import org.testng.annotations.*;

/**
 * Created by PAULA on 09/05/2018.
 */
public class MethodeTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\n"+"Before test");

    }

    @Test
    public void test1() {
        System.out.println("Test 1"+ "\n");
    }

    @Test
    public void test2() {
        System.out.println("Test 2"+ "\n");
    }

    @Test
    public void test3() {
        System.out.println("Test 3"+ "\n");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");

    }
}

