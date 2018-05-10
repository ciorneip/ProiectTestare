import org.apache.http.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by PAULA on 20/04/2018.
 */
public class RegisterPage {

    public final String EMAIL_ADRESS = "asde";
    public final String USER = "jhjh";
    public final String PASSWORD = "tes";
    public final String INVALID_EMAIL_MESSAGE = "Email Invalid";
    public final String INVALID_PASSWORD_MESSAGE = "Password cannot be less than 4 characters";
    public final String INVALID_ROBOTEL_MESSAGE = "Captcha validation failed";


    @FindBy(css = ".ButtonLogin")
    public WebElement loginButton;

    @FindBy(linkText = "Register")
    public WebElement registerTab;

    @FindBy(css=".tab-content #register input[name='email']")
   // @FindBy(xpath = "//*[@id=\"register\"]/form/div[1]/div/input")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"register\"]/form/div[2]/div/input")
    public WebElement userInput;

    @FindBy(xpath = "//*[@id=\"register\"]/form/div[3]/div/input")
    public WebElement passwordInput;

    @FindBy(id = "recaptcha-anchor")
    public WebElement robotel;

    @FindBy(xpath = "//*[@id=\"register\"]/form/div[5]/div/input")
    public WebElement registerButton;

    //@FindBy(css = "div.alert-danger:nth-child(1)")
    @FindBy(xpath = "//*[@id=\"extra\"]/div")
    public WebElement invalidRobotelMessage;

    @FindBy(css = "div.alert-danger:nth-child(2)")
    public WebElement invalidPasswordMessage;

    @FindBy(css = "div.alert-danger:nth-child(1)")
    public WebElement invalidEmailMessage;

    public void clickLogin() {
        loginButton.click();
    }

    public void selectRegister() {
        registerTab.click();
    }

    public void setCreateUser(String email, String user,String password) {
        emailInput.sendKeys(email);
        userInput.sendKeys(user);
        passwordInput.sendKeys(password);
    }

    public void setCreateUser2(String email, String user,String password) {
    }

    public void setCreateUser() {
        emailInput.sendKeys(EMAIL_ADRESS);
        userInput.sendKeys(USER);
        passwordInput.sendKeys(PASSWORD);
    }

    public void clickRobotel() {
        robotel.click();
    }

    public void clickRegister() {
        registerButton.click();
    }

    public void checkErrorMessages() {
        //Assert.assertEquals(INVALID_EMAIL_MESSAGE, invalidEmailMessage.getText());
        // Assert.assertEquals(INVALID_PASSWORD_MESSAGE, invalidPasswordMessage.getText());
        Assert.assertEquals(INVALID_ROBOTEL_MESSAGE, invalidRobotelMessage.getText());
    }

    public void checkErrorMessages2(String actualError, String expectedError) {
        Assert.assertEquals(actualError, expectedError) ;
    }
    public void clickButton(WebElement myButton) {
        myButton.click();
    }
}
