package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class EdgeBrowser implements Browser{
    private WebDriver driver;

    private FirefoxOptions fireFoxOptions;

    @Override
    public void openBrowser() {
        configBrowser();
        driver = new FirefoxDriver(fireFoxOptions);

        driver.get("https://demoqa.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LoggerUtility.startTest(this.getClass().getSimpleName());

    }

    @Override
    public void configBrowser() {
        fireFoxOptions = new FirefoxOptions();
        fireFoxOptions.addArguments("window-size=1680,1050");
        fireFoxOptions.addArguments("--disable-gpu");
        fireFoxOptions.addArguments("--disable-infobars");
        fireFoxOptions.addArguments("--disable-extensions");
     //   edgeOptions.addArguments("--headless=new");
        fireFoxOptions.addArguments("--incognito");


    }

    public WebDriver getDriver() {
        return driver;
    }
}
