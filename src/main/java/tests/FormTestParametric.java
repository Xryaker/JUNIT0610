package tests;

import configuretions.BaseClass;
import data.DataProvider;
import data.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageobjekts.FormConsultation;
import pageobjekts.MainPage;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FormTestParametric extends BaseClass {
    static final String mainURL = "https://vinnytsia.ithillel.ua/";


    private User user;

    public FormTestParametric(User user) {
        this.user = user;
    }
    @Parameterized.Parameters
    public static Collection getParams(){
        return DataProvider.getUserList();
    }

    @Before
    public void before() {
            driver.get("https://vinnytsia.ithillel.ua/");
    }

    @Test
    public void formTest() {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        FormConsultation formConsultation = PageFactory.initElements(driver, FormConsultation.class);
        mainPage.buttonClick();
        formConsultation.compliteForm(user);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
