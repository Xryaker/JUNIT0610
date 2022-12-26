package configuretions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver create(BROWSERS browsers) {
        if (driver == null) {
            switch (browsers) {
                case CHORMDRIVERMANAGER -> createCromeDriverManager();
                case CHROMEINCOGNITO -> createChrome();
                case FIREFOX -> ctreateFirefox();
            }
        }
        return driver;
    }

    private static void createCromeDriverManager() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
    }


    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//            options.addArguments("--headless");
        driver = new ChromeDriver(options);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    private static void ctreateFirefox() {

    }

    private void createChromeProxy() {
    }

}

