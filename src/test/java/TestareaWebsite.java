//import org.junit.Assert;
//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by PAULA on 19/09/2017.
 */
public class TestareaWebsite {

    @Test
    public void verifyLinksFromWebsite() throws InterruptedException {
        //se deschide instanta de browser
        System.setProperty("webdriver.chrome.driver", "C://seleniumdrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.trafic.ro/");

        //initializare pagina
        TestarePage testarePage = PageFactory.initElements(driver, TestarePage.class);

        int categorySize = testarePage.getCategoryEntity().size();
        System.out.print("Numarul de categoirii: " + categorySize + "\n");
        List<WebElement> categoriesNameFromWebsite = testarePage.getCategoryEntity();
        for (int i = 0; i < categorySize; i++) {
            String categoryNameFromWebsite = testarePage.getCategoryNameFromWebsite(categoriesNameFromWebsite.get(i));
            System.out.print("Category name: " + categoryNameFromWebsite + "\n");
        }
        driver.close();
        driver.quit();
    }
}
