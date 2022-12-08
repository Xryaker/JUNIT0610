package pageobjekts;

import configuretions.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.PageUtil;

public class QAPage {
    @FindBy(id = "coachesShowAllButton")
    WebElement button;
@FindBy(xpath = "//h2[@class=\"introduction-info_title\"]")
WebElement titleIntro;
    private void scrolToButton(WebDriver driver,By by){
        PageUtil.scrollToElementVisibilityOf(driver, by);
    }

    public void clickButton(WebDriver driver) {
        scrolToButton(driver,By.id("coachesShowAllButton"));
        button.click();
    }

    public String getTitleIntrotext(WebDriver driver){
        scrolToButton(driver,By.xpath("//h2[@class=\"introduction-info_title\"]"));
        return titleIntro.getText();
    }
}
