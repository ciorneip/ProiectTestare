//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by PAULA on 19/09/2017.
 */
public class OpenBrowser {

    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver", "C://seleniumdrivers//chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        //driver.navigate().to("http://www.google.com");
        driver.get("http://www.google.com");
        System.out.print(driver.getTitle());
        Thread.sleep(7000);
        driver.close();
    }

    @Test
    public void verifyHomePage() throws InterruptedException {
        //se deschide instanta de browser
        //    WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C://seleniumdrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //se cauta url-ul dorit
        driver.navigate().to("http://www.trafic.ro/");
        //se verifica daca pagina contine un titlu si incepe cu " Ghid foto"
        assertTrue("Titulul ce trebuie sa apara pe site: Top site",                driver.getTitle().startsWith("Clasamente"));
        //cautarea unui elenentului dupa un text care la click sa conduca la o alta pagina
        //elementul respectiv trebuie sa contina un link
        driver.findElement(By.linkText("Saptamana")).click();
        //cautarae unui elenemt dupa o anumita clasa din pagina
      //  driver.findElement(By.className("etry-more-btn")).click();
        // se asteapta pe pagina o durata dupa click
        Thread.sleep(7000);            //timpul de asteptare
        //se intoarce la pagina anterioara si se ateapta un timp
        driver.navigate().back();
        Thread.sleep(4000);
        //se intoare la pagina din inainte
        driver.navigate().forward();
        // inchidera browser
        driver.close();
        driver.quit();
    }

}
