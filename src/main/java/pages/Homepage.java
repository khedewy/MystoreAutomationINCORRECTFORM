package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase{
    public Homepage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    @FindBy(css = "a.login")
    WebElement loginbutton;

    @FindBy(id = "search_query_top")
    WebElement searchbox;

    @FindBy(css = "button.btn.btn-default.button-search")
    WebElement searchbtn;

    @FindBy(css = "a.logout")
    WebElement logoutBtn;

    @FindBy(css = "a.sf-with-ul")
    WebElement dressbtn;

    @FindBy(linkText = "Evening Dresses")
    WebElement eventDress;

    @FindBy(id = "contact-link")
    WebElement contactUsBtn;

    @FindBy(css = "img.replace-2x.img-responsive")
    WebElement ProductBtns;

    public void movetoproductpage(){
        clickbutton(ProductBtns);
    }

    public void movetocontactUs(){
        clickbutton(contactUsBtn);
    }

    public void hovermenue(){

        actions.moveToElement(dressbtn).moveToElement(eventDress).click().build().perform();
    }

    public void Logout(){
        clickbutton(logoutBtn);
    }

    public void usercansearch(String productname){
        settext(searchbox,productname);
        clickbutton(searchbtn);
    }

    public void movetologinpage(){
        clickbutton(loginbutton);
    }
    public void clearsearchbox(){
        clearelements(searchbox);
    }

}
