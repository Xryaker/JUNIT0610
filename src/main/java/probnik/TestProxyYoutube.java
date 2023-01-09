package probnik;

import configuretions.BaseProxy;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import util.WorkWithLogs;

public class TestProxyYoutube extends BaseProxy {
    @BeforeClass
   public static void openPage(){
        driver.get("https://www.youtube.com/");
    }
    @Test
    public void test1(){
        System.out.println(driver.getCurrentUrl());
//       driver.findElement(By.id("search-input")).sendKeys("Ukraine");
//       driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
    }

}
