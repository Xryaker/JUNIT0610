package pageobjekts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    @FindBy(id = "btn-consultation-hero")
    WebElement consultationButton;
    @FindBy(xpath = "//ul[contains(@class,\"site-nav-menu_list\")]")
    WebElement listMenu;
    @FindBy(xpath = "//p[contains(@class,\"course-label_name\")]")
    List<WebElement> listCurse;
    @FindBy(xpath = "//nav[@class=\"header-bar_left\"]")
    WebElement cityHolder;

    public WebElement getConsultationButton(){
        return consultationButton;
    }
    public List<String> getUrlByCityHolder() {
        List<String> list = new ArrayList<>();
        List<WebElement> webElements = cityHolder.findElements(By.tagName("a"));
        for (WebElement l : webElements) {
            list.add(l.getAttribute("href"));
        }
        return list;
    }


    public void selectCource(String name) {
        for (WebElement l : listCurse) {
            if (l.getText().equals(name)) {
                l.click();
                break;
            }
        }

    }

    public void buttonClick() {
        consultationButton.click();
    }

    public void clickButtonCourse() {
        select("курси");
    }

    private void select(String sttr) {

        List<WebElement> list = listMenu.findElements(By.xpath("//button[contains(@class,\"site-nav-link\")]"));

        System.out.println(list.size());
        for (WebElement l : list) {
            System.out.println(l.getText());
            try {
                if (l.getText().equals(sttr)) {
                    l.click();
                    break;
                }
            } catch (NotFoundException e) {
                // e.printStackTrace();

            }
        }
    }

}
