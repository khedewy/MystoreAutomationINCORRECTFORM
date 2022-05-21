package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagebase {
    WebDriver driver;
    public Select select;
    public Actions actions;
    public Pagebase(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void settext(WebElement text,String value){
        text.sendKeys(value);
    }

    public void clickbutton(WebElement button){
        button.click();
    }

    public void clearelements(WebElement clear){
        clear.clear();
    }


}
