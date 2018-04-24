//import org.junit.Assert;
//import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by PAULA on 19/09/2017.
 */
public class VoluntariatWebsite {

    @Test
    public void navigationTest() throws InterruptedException {
        //se deschide instanta de browser
        System.setProperty("webdriver.chrome.driver", "C://Users//PAULA//Desktop//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.tedoo.ro/wwoof-voluntariat-la-ferme-organice-pentru-cazare/");

        //initializare pagina

        VoluntarPage voluntarPage = PageFactory.initElements(driver, VoluntarPage.class);
        voluntarPage.getMenu(driver);




    }
}
