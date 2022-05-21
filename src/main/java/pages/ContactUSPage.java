package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUSPage extends Pagebase{
    public ContactUSPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_contact")
    WebElement subjectHeading;

    @FindBy(id = "email")
    WebElement emailTxt;

    @FindBy(id = "id_order")
    WebElement idOrderTxt;

    @FindBy(id = "submitMessage")
    WebElement submitMessage;

    @FindBy(id = "message")
    WebElement messageBox;

    @FindBy(css = "p.alert.alert-success")
    public WebElement successfulMessage;

    public void sendMessage(String email, String Order, String message){
        select = new Select(subjectHeading);
        select.selectByIndex(1);
        settext(emailTxt,email);
        settext(idOrderTxt,Order);
        settext(messageBox,message);
        clickbutton(submitMessage);

    }
}
