package pageobjekts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage {
    @FindBy(id = "ca-view")
    WebElement menutab1;
    @FindBy(id = "ca-viewsource")
    WebElement menutab2;
    @FindBy(id = "ca-history")
    WebElement menutab3;

    public String getMenuta1Text(){
       return menutab1.getText();
    }
    public String getMenuta2Text(){
        return menutab2.getText();
    }
    public String getMenuta3Text(){
        return menutab3.getText();
    }
}
