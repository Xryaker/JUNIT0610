package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageUtil {

    public static void scrollToElementVisibilityOf(WebDriver d, By by) {//метод который скролит до элемента
        JavascriptExecutor js = (JavascriptExecutor) d;
        boolean bool = false;
        while (!bool) {//цикл проверяет есть ли элемент, если не находит скролит до тех пор пока не найдет этот элемент
            try {
                d.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,200)");
            }
        }
    }
}
