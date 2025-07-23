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
import pages.AlertFrameWindowPage;
import pages.FramesPage;
import pages.IndexPage;
import sharedData.SharedData;

import java.time.Duration;

public class FrameTest extends SharedData {


    @Test

    public void testMethod() {
        // driver.get("https://demoqa.com/");

        //de inlocuit liniile 23,24, 27 de refactorizat pt metodele care exista
//        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
//        FrameHelper frameHelper = new FrameHelper(driver);
//        PageHelper pageHelper= new PageHelper(driver);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithAlertSFrameWindowMenu();

//        WebElement alerstWindowsElementHelper = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
//        WebElement framesElements = driver.findElement(By.xpath("//span[text()='Frames']"));
//        elementHelper.clickJSElement(framesElements);
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", alerstWindowsElement);
//        //frameHelper.clickJSElement(alerstWindowsElementHelper);
//        elementHelper.clickJSElement(alerstWindowsElementHelper);
//
//        WebElement alertsElement = driver.findElement(By.xpath("//span[text()='Frames']"));
//        frameHelper.switchFrameByElement(driver.findElement(By.xpath("//span[text()='Frames']")));
//        // executor.executeScript("arguments[0].click();", alertsElement);
//        // frameHelper.clickJSElement(alertsElement);
//        elementHelper.clickJSElement(alertsElement);
        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithFramesSubMenu();

//        driver.switchTo().frame("frame1");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
//        frameHelper.switchFrameByElement(driver.findElement(By.xpath("//iframe[@id='frame1']")));

//       WebElement firstBlockELement = driver.findElement(By.id("sampleHeading"));
//       System.out.println(firstBlockELement.getText());
//       elementHelper.printTextElement(firstBlockELement);

        FramesPage framesPage = new FramesPage(getDriver());
        framesPage.dealWithBigFrame();
        framesPage.dealWithLittleFrame();
//
//        driver.switchTo().parentFrame();
//        frameHelper.switchToParent();
//        frameHelper.switchToParent();
//
//        driver.switchTo().frame("frame2");
//        frameHelper.switchFrameByString("frame2");
//        WebElement secondFrameElement= driver.findElement(By.id("sampleHeading"));
//        System.out.println(secondFrameELement.getText());
//        elementHelper.printTextElement(secondFrameElement);
//
//        driver.switchTo().parentFrame();
//
//       // driver.quit();
    }
}

