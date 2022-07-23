import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTestClass {

    WebDriver driver;
    static ChromeOptions chromeOptions = new ChromeOptions();

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
//      chromeOptions.addArguments("--headless");
        chromeOptions.setImplicitWaitTimeout(Duration.ofMillis(3000));
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
