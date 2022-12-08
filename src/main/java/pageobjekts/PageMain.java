package pageobjekts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMain {
    By consulButton= By.id("btn-consultation-hero");
     WebDriver webDriver;

    public PageMain(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickButoon(){
        webDriver.findElement(consulButton).click();
    }
}
