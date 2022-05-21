package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends Pagebase{
    public EmailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "send_friend_button")
    WebElement SendEmailBtn;

    @FindBy(id = "friend_name")
    WebElement FriendNametxt;

    @FindBy(id = "friend_email")
    WebElement EmailFriendtxt;

    @FindBy(id = "sendEmail")
    WebElement submitEmailBtn;

    @FindBy(css = "input.button")
    WebElement agreeBtn;

    @FindBy(css = "i.icon-home")
    WebElement Homepagebtn;

    @FindBy(id = "bigpic")
    WebElement BigPictureBtn;

    public void clickBigPicture(){
        clickbutton(BigPictureBtn);
    }

    public void BackToHomePage(){
        clickbutton(Homepagebtn);
    }

    public void setAgreeBtn(){
        clickbutton(agreeBtn);
    }

    public void moveTosendEmail(){
        clickbutton(SendEmailBtn);
    }
    public void  SendEmailToFriend(String name, String email){
        settext(FriendNametxt,name);
        settext(EmailFriendtxt,email);
        clickbutton(submitEmailBtn);
    }
}
