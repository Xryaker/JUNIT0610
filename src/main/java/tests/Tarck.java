package tests;

import configuretions.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjekts.MainPage;
import pageobjekts.QAPage;
import static org.junit.Assert.*;


public class Tarck extends BaseClass {
    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    QAPage qaPage = PageFactory.initElements(driver, QAPage.class);

    @BeforeClass
    public static void start() {
        driver.get("https://vinnytsia.ithillel.ua/");

    }

    @Test
    public void track() {
        mainPage.clickButtonCourse();
        mainPage.selectCource("QA Automation");
//        qaPage.clickButton(driver);
        assertEquals(qaPage.getTitleIntrotext(driver),"Перейди в автоматизацію!");
    }
    @Test
    public void track1(){
        System.out.println(driver.getTitle());
    }


}
