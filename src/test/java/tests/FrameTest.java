package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.FrameHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;

public class FrameTest extends SharedData {



    @Test

    public void testMethod() {
       // driver.get("https://demoqa.com/");

      //de inlocuit liniile 23,24, 27 de refactorizat pt metodele care exista
        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
        FrameHelper frameHelper = new FrameHelper(driver);
        PageHelper pageHelper= new PageHelper(driver);

        WebElement alerstWindowsElementHelper = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", alerstWindowsElement);
        //frameHelper.clickJSElement(alerstWindowsElementHelper);
        elementHelper.clickJSElement(alerstWindowsElementHelper);

        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Frames']"));
       // executor.executeScript("arguments[0].click();", alertsElement);
       // frameHelper.clickJSElement(alertsElement);
        elementHelper.clickJSElement(alertsElement);

        // driver.switchTo().frame("frame1");
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        frameHelper.switchFrameByElement(driver.findElement(By.xpath("//iframe[@id='frame1']")));

       WebElement firstBlockELement= driver.findElement(By.id("sampleHeading"));
//        System.out.println(firstBlockELement.getText());
        elementHelper.printTextElement(firstBlockELement);

       // driver.switchTo().parentFrame();
        frameHelper.switchToParent();

        //driver.switchTo().frame("frame2");
        frameHelper.switchFrameByString("frame2");

        WebElement secondFrameELement= driver.findElement(By.id("sampleHeading"));
       // System.out.println(secondFrameELement.getText());
        elementHelper.printTextElement(secondFrameELement);

        //driver.switchTo().parentFrame();

       // driver.quit();
    }
}
