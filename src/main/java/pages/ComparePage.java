package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends Pagebase{
    public ComparePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
    WebElement comparePageBtn;

    @FindBy(id = "product_comparison")
    WebElement productTable;

    @FindBy(tagName = "tr")
    List<WebElement> allrows;

    @FindBy(tagName = "td")
    List<WebElement> allColumns;

    public void compareProducts(){
        for (WebElement row : allrows){
            System.out.println(row.getText());
            for (WebElement column : allColumns){
                System.out.println(column.getText());
            }
        }
    }

    public void MoveToComparePage(){
        clickbutton(comparePageBtn);
    }
}
