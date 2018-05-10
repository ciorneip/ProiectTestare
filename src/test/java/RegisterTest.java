//import org.junit.Assert;
//import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

/**
 * Created by PAULA on 19/09/2017.
 */
public class RegisterTest {

    // @DataProvider
    @DataProvider(name = "register")
    public static Object[][] registerUser() {
        return new Object[][]{{"anca", "tst", "bla"}, {"paula’", "123", "bla"}};
    }

    WebDriver driver;

    @BeforeTest
    public void initialiseDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Users//PAULA//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Before test");
    }
    @BeforeMethod
    public void beforeMetode() {
              System.out.println("\n"+"Before metode");
    }

    @Test(description = "Check register error messages")
    public void registerAccount() throws InterruptedException {
        //se deschide instanta de browser
        //System.setProperty("webdriver.chrome.driver", "C://Users//PAULA//Desktop//chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.geeksforgeeks.org/image-processing-java-set-9-face-detection/ ");
        driver.manage().window().maximize();
        //initializare pagina
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        registerPage.clickLogin();
        registerPage.selectRegister();
        Thread.sleep(5000);
        registerPage.setCreateUser();

        Thread.sleep(5000);
        // registerPage.clickRobotel();
        //registerPage.clickRegister();

        registerPage.clickButton(registerPage.registerButton);
        Thread.sleep(10000);

       // registerPage.checkErrorMessages();
        registerPage.checkErrorMessages2(registerPage.INVALID_ROBOTEL_MESSAGE, registerPage.invalidRobotelMessage.getText());

        //  driver.close();
        // driver.quit();
        System.out.println("test1");
    }

    @Test(description = "Data provider =register test", dataProvider = "register")
    public void registerNewAccounts(String email, String user, String password) throws InterruptedException {

        //se deschide instanta de browser
        //  System.setProperty("webdriver.chrome.driver", "C://Users//PAULA//Desktop//chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.geeksforgeeks.org/image-processing-java-set-9-face-detection/ ");
        driver.manage().window().maximize();
        //initializare pagina
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        registerPage.clickLogin();
        registerPage.selectRegister();
        Thread.sleep(5000);
        registerPage.setCreateUser(email, user, password);
        Thread.sleep(5000);
        // registerPage.clickRobotel();
        registerPage.clickRegister();
        Thread.sleep(10000);
        registerPage.checkErrorMessages();
        System.out.println("test2");
    }


    @AfterTest(alwaysRun = true)
    public void closeDriver() {
        driver.close();
        driver.quit();
        System.out.println("\n"+"After test");
    }
    @AfterMethod
    public void afterMetode() {
        System.out.println("After metode");
    }


    //DIFERENTA AfterTest/BeforeTest & AfterMethod /BeforeMethod ---
    //AfterTest - de 2 ori  -  la fiecare @test
    //AfterMethod - de 3 ori - la fiecate metoda
}
