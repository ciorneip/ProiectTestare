import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by PAULA on 18/03/2018.
 */
public class TestarePage {

    // public WebDriver driver;
//    @FindBy(id = "categories")
//    List<WebElement> categoryEntity;

    @FindBy(xpath = "//li[@class='category closefolder ']/a[1]")
    List<WebElement> categoryEntity;

    public List<WebElement> getCategoryEntity() {
        return categoryEntity;
    }

//    public WebElement getTitlu() {
//        return categoryEntityu;
//    }

    public String getCategoryNameFromWebsite(WebElement categoryName) {
        return categoryName.getAttribute("title");
    }

}
