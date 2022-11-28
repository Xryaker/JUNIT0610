package tests;

import configuretions.BaseClass;
import data.User;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjekts.FormConsultation;
import pageobjekts.MainPage;

public class FormTest extends BaseClass {
    static final String mainURL = "https://vinnytsia.ithillel.ua/";
    static MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    static FormConsultation formConsultation = PageFactory.initElements(driver, FormConsultation.class);

    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://vinnytsia.ithillel.ua/");
        }
    }

    @Test
    public void formTest() {
        mainPage.buttonClick();
        formConsultation.compliteForm(new User());
    }
}
