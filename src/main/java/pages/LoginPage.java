package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email")
    WebElement emailtxt;

    @FindBy(id = "passwd")
    WebElement passwordtxt;

    @FindBy(id = "SubmitLogin")
    WebElement submitlog;

    public void loginInformation(String email,String password) throws InterruptedException {
        settext(emailtxt,email);
        settext(passwordtxt,password);
        Thread.sleep(3000);
        clickbutton(submitlog);
    }
}
