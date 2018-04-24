import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by PAULA on 21/04/2018.
 */
public class VoluntarPage {
    @FindBy(id = "main-nav")
    List<WebElement> navigationMenu;

    //public WebDriver driver;

    public List<WebElement> getNavigationMenu() {
        return navigationMenu;
    }

    public void selectHover(WebElement element, WebDriver driver) {
        Actions hover = new Actions(driver);
        hover.moveToElement(element).build().perform();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getMenu(WebDriver driver) {
        for (int i = 0; i < getNavigationMenu().size(); i++) {
            System.out.println("nume navigatie \n" + getNavigationMenu().get(i).getText());
            selectHover(getNavigationMenu().get(i), driver);
            //List<WebElement>

        }
    }

    //inchidere proces chromedriver
    //nume clasa frumos
    //thread


}
