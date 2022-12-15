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

   static public boolean pauseUntil(WebDriver driver,By by,String str){
        int i=0;
        while (true){
            System.out.println(i);
            if(driver.findElement(by).getText().equals(str)){
                return true;
            }else{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i==10) {
                    return false;
                }
                i++;

            }

        }
    }
}
