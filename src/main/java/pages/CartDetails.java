package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDetails extends Pagebase{
    public CartDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input.cart_quantity_input.form-control.grey")
    WebElement quantityTxt;

    @FindBy(css = "i.icon-trash")
    WebElement deleteBtn;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
    WebElement cartPageBtn;

    public void goToCart(){
        clickbutton(cartPageBtn);
    }

    public void updateCart(String quantity) throws InterruptedException {
        clearelements(quantityTxt);
        Thread.sleep(2000);
        settext(quantityTxt,quantity);
    }
    public void deleteitems(){
        clickbutton(deleteBtn);
    }
}
