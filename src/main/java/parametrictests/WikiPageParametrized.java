package parametrictests;

import configuretions.BaseClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pageobjekts.WikiPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class WikiPageParametrized extends BaseClass {
    static Language lang;
    ResourceBundle bundle;
    WikiPage wikiPage;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public WikiPageParametrized(Language language) {
        System.out.println("start");
        lang = language;
        bundle = ResourceBundle.getBundle(lang.getCountryCode());

        wikiPage = PageFactory.initElements(driver, WikiPage.class);
    }
    @Before
    public void openPage(){
        if(!driver.getCurrentUrl().contains("https://" + bundle.getString("lang") + ".wikipedia.org/")){
            driver.get("https://" + bundle.getString("lang") + ".wikipedia.org/");
        }
    }

    @Test
    public void titleTextTest() {
        assertEquals(bundle.getString("title"), driver.getTitle());
    }
    @Test
    public void menuTab1(){
        assertEquals(bundle.getString("menutab1"),wikiPage.getMenuta1Text());
    }
    @Test
    public void menuTab2(){
        assertEquals(bundle.getString("menutab2"),wikiPage.getMenuta2Text());
    }
    @Test
    public void menuTab3(){
        assertEquals(bundle.getString("menutab3"),wikiPage.getMenuta3Text());

    }

}
