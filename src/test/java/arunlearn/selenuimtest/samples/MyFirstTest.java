package arunlearn.selenuimtest.samples;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MyFirstTest {

    @Test
    public void startWebDriver() {

        System.setProperty("webdriver.chrome.driver", "c:\\projects\\chrome\\chromedriver_win32\\chromedriver.exe");

          ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com");
        Assert.assertTrue("Title should start with youtube", driver.getTitle().contains("YouTube"));
        driver.close();
        driver.quit();
    }

}
