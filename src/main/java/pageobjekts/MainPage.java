package pageobjekts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(id = "btn-consultation-hero")
    WebElement consultationButton;

    public void buttonClick(){
        consultationButton.click();
    }
}
