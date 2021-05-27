package TestBase;

import configuration.BrowserEnvironment;
import configuration.EnvironmentProperty;
import configuration.PropertyStore;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class TestBase {

    protected static WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger("TestBase.class");
    private static BrowserEnvironment browserEnvironment;
    public static EnvironmentProperty environmentProperty;


    @BeforeAll
    static void setUp() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
         driver = browserEnvironment.getDriver();
        logger.debug("Driver initialized");

    }

    @AfterEach
    void afterEach() throws IOException {

    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        logger.debug("Driver closed");
    }

}
