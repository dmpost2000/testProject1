import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FirstScriptTest extends BaseTestClass {

    @Test
    public void eightComponents1() {

        driver.get("https://google.com");

        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        String value = searchBox.getAttribute("value");
        Assertions.assertEquals("Selenium", value);
    }

    @Test
    public void eightComponents2() {

        driver.get("https://google.com");

        String title = driver.getTitle();
        Assertions.assertEquals("Google", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        String value = searchBox.getAttribute("value");
        Assertions.assertEquals("Selenium", value);
    }
}