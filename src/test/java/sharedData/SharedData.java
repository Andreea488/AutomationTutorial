package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    private WebDriver driver;

    @BeforeMethod
    public void preparedEnvironment() {

        //deschidem o instanta de Chrome
        driver = new ChromeDriver();

        //accesam o pagina specifica
        driver.get("https://demoqa.com/");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LoggerUtility.startTest(this.getClass().getSimpleName());
    }

    @AfterMethod
    public void clearEnvironment() {
        driver.quit();

        LoggerUtility.finishTest(this.getClass().getSimpleName());

    }

    public WebDriver getDriver() {
        return driver;
    }
}
