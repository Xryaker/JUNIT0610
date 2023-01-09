package parametrictests;

import configuretions.BaseClass;
import data.UserList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageobjekts.FormConsultation;
import pageobjekts.MainPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class HillelConsultParametersTests extends BaseClass {

    public static String name;
    public static MainPage mainPage;
    public  static FormConsultation formConsultation;
    public static ResourceBundle bundle;

    @Parameterized.Parameters
    public static Collection options() {
//        return Arrays.asList("Kate","Nikolay");
        return UserList.positiveListUsers();

    }

    public HillelConsultParametersTests(String name) {

                formConsultation = PageFactory.initElements(driver, FormConsultation.class);
                mainPage = PageFactory.initElements(driver, MainPage.class);
                bundle = ResourceBundle.getBundle(name);
                System.out.println("rerun");

        }



    @Test
    public void test1() {
        driver.get("https://vinnytsia.ithillel.ua/");
        mainPage.getConsultationButton().click();formConsultation.setName(bundle.getString("name"));
        formConsultation.setEmail(bundle.getString("email"));
        formConsultation.setTel(bundle.getString("telephoneNumber"));
        formConsultation.setSocialList(bundle.getString("msg"));
    }



}
