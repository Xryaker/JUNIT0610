package parametrictests;

import configuretions.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ResourceBundle;

public class WikiPediatests  extends BaseClass{
String str="fr";
    @Test
    public void testProba(){
        ResourceBundle bundle=ResourceBundle.getBundle(str);
        driver.get("https://"+str+".wikipedia.org/");
       // driver.findElement(By.id("ca-view"))
        Assert.assertEquals(bundle.getString("menutab1"),driver.findElement(By.id("ca-view")).getText());
    }

}
