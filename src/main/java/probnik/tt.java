package probnik;

import data.UFieald;
import data.UseBuilder;
import org.openqa.selenium.WebDriver;
import singletone.SIngletoneEX;

public class tt {
    static WebDriver driver;
    public static void main(String[] args) {
        SIngletoneEX sIngletoneEX=SIngletoneEX.SIngletoneEXinstance();
        driver=sIngletoneEX.getDriver();

        SIngletoneEX secong=SIngletoneEX.SIngletoneEXinstance();
        driver= secong.getDriver();


        UseBuilder useBuilder=UseBuilder.builder()
                .setEmail("mailex@gmail.com")
                .setName("Vasiliy")
                .setTelephone("66666")
                .setAge(16)
                .buid();
        UFieald uFieald=UFieald
                .builder()
                .setStrt("Sometext")
                .buid();
        System.out.println(useBuilder.getName());
        System.out.println(useBuilder.getTelephone());
    }
}
