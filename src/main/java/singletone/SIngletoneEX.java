package singletone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIngletoneEX {
    static private SIngletoneEX sIngletoneEX=null;
    private static WebDriver driver;
    public static SIngletoneEX SIngletoneEXinstance() {
        if(sIngletoneEX==null) {
            sIngletoneEX =new SIngletoneEX();
            driver=new ChromeDriver();
            driver.get("https://google.com/");
        }
        return sIngletoneEX;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
