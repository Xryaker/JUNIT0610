package pageobjekts;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FormConsultation {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement email;
    @FindBy(id = "input-tel-consultation")
    WebElement tel;
    @FindBy(xpath = "//button[contains(@class,\"socials-input-triggers\")]")
    List<WebElement> socialList;

    public void compliteForm(User user) {
        this.name.sendKeys(user.getName());
        this.email.sendKeys(user.getEmail());
        this.tel.sendKeys(user.getTelephone());
        selectSocial("tg");
    }

    private void selectSocial(String socialName) {
        for (WebElement l:socialList){
           if( l.getAttribute("data-name").equals(socialName)){
               System.out.println(l.getAttribute("data-name"));
               l.click();
           }
        }
    }

    public void compliteForm(String name, String email, String tel) {
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.tel.sendKeys(tel);
    }

}
