package testCases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class DemoTestCase {

    @Managed
    WebDriver driver;

    @Test
    public void firstSerenityTest(){
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("What is learned helplessness?");
    }

}
