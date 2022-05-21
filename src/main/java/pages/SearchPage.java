package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Pagebase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "i.icon-th-list")
    WebElement changetheshapebtn;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    WebElement adddTocartbtn;

   // @FindBy()

    public void addtocart(){
        clickbutton(adddTocartbtn);
    }

    public void changingshape(){
        clickbutton(changetheshapebtn);
    }
}
