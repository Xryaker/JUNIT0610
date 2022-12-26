package configuretions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pageobjekts.FormConsultation;
import pageobjekts.MainPage;

import java.util.ResourceBundle;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
       driver=DriverConfig.create(BROWSERS.CHORMDRIVERMANAGER);

    }
    @AfterClass
    public static void after(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
