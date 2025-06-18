package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameTest {

    public WebDriver driver;

    @Test

    public void testMethod() {
        //deschidem o instanta de Chrome
        driver = new ChromeDriver();

        //accesam o pagina specifica
        driver.get("https://demoqa.com/");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement alerstWindowsElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", alerstWindowsElement);

        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        executor.executeScript("arguments[0].click();", alertsElement);

       // driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement firstBlockELement= driver.findElement(By.id("sampleHeading"));
        System.out.println(firstBlockELement.getText());

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame2");
        WebElement secondFrameELement= driver.findElement(By.id("sampleHeading"));
        System.out.println(secondFrameELement.getText());

        driver.switchTo().parentFrame();

        driver.quit();
    }
}
