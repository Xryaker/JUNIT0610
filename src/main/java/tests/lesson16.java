package tests;

import configuretions.BaseClass;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjekts.MainPage;
import util.PageUtil;
import util.WorkWithLogs;

import java.time.Duration;
import java.util.logging.Level;


public class lesson16 extends BaseClass {
  static MainPage mainPage;
    @BeforeClass
    public static void start() {
        driver.get("https://vinnytsia.ithillel.ua/");
     mainPage  = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void test1(){
        assertTrue("Consultation button is not displayed", mainPage.getConsultationButton().isDisplayed());
    }
    @Test
    public void test2(){
        assertEquals("Rhdjsdjddj",mainPage.getConsultationButton().getText());
    }
    @Test
    public void test3(){
        assertNotNull("object mainpage is null",mainPage);
    }
    @Test
    public void test4(){

       assertTrue(new WebDriverWait(driver, 5)
               .until(ExpectedConditions.textToBe(By.id("btn-consultation-hero"),"Безкоштовна консультація")));

    }

    @Test
    public void test5(){
        assertTrue(PageUtil.pauseUntil(driver,By.id("btn-consultation-hero"),"Безкоштона консультація"));
    }

    @Before
    public void befor(){
        System.out.println("befor");
    }
    @AfterClass
    public static void closePage(){
      // WorkWithLogs.printLogs(driver);
        WorkWithLogs.writeLogsToFile(driver,"logsY", Level.SEVERE );
    }

}
