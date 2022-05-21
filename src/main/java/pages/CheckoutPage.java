package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Pagebase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
    WebElement processedToCheckout1;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    WebElement processedToCheckout2;

    @FindBy(id = "cgv")
    WebElement agreeService;

    @FindBy(css ="button.button.btn.btn-default.standard-checkout.button-medium" )
    WebElement getProcessedToCheckout3;

    @FindBy(css = "a.bankwire")
    WebElement bankwirebtn;

    @FindBy(css = "a.cheque")
    WebElement chequebtn;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    WebElement confirmbutton;

    public void completecheckout() throws InterruptedException {
        clickbutton(processedToCheckout1);
        Thread.sleep(5000);
        clickbutton(processedToCheckout2);
        Thread.sleep(5000);
        clickbutton(agreeService);
        clickbutton(getProcessedToCheckout3);
        Thread.sleep(5000);
        clickbutton(bankwirebtn);
        Thread.sleep(5000);
        clickbutton(confirmbutton);
        Thread.sleep(5000);



    }
}
