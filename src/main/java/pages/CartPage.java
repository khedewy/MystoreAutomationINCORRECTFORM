package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Pagebase{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "span.continue.btn.btn-default.button.exclusive-medium")
    WebElement continueshopingbtn;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    WebElement gotocheckout;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    WebElement addtocart;

    @FindBy(css = "a.addToWishlist.wishlistProd_1")
    WebElement addToWishListBtn;

    @FindBy(css = "a.add_to_compare")
    WebElement addToComparePageBtn;


    @FindBy(css = "span.cross")
    WebElement closealert;

    @FindBy(css = "a.fancybox-item.fancybox-close")
    WebElement closeNotificationCross;

    public void closeNotification(){
        clickbutton(closeNotificationCross);
    }

    public void closealert(){
        clickbutton(closealert);
    }

    public void setAddtocart(){
        clickbutton(addtocart);
    }

    public void continueshoping(){
        clickbutton(continueshopingbtn);
    }
    public void setGotocheckout(){
        clickbutton(gotocheckout);
    }
    public void addToWishList(){
        clickbutton(addToWishListBtn);
    }
    public void setAddToComparePage(){
        clickbutton(addToComparePageBtn);
    }
}
