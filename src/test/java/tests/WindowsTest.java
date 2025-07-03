package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import helperMethods.TabHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends SharedData {

    @Test

    public void testMethod() {
        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
        TabHelper tabHelper= new TabHelper (driver);
        //driver.get("https://demoqa.com/");


        WebElement alerstWindowsElement=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
       // JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", alerstWindowsElement);
        elementHelper.clickJSElement(alerstWindowsElement);

        WebElement WindowsElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
       // executor.executeScript("arguments[0].click();", WindowsElement);
        elementHelper.clickJSElement(WindowsElement);

        WebElement newtabElement= driver.findElement(By.id("tabButton"));
        //executor.executeScript("arguments[0].click();", newtabElement);
       // newtabElement.click();
        elementHelper.clickJSElement(newtabElement);
       // System.out.println(driver.getCurrentUrl());

        tabHelper.switchToSpecificTab(1);

//        List<String> tabsList= new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabsList.get(1));
//        System.out.println(driver.getCurrentUrl());
        //inchidere tab
//        driver.close();
        tabHelper.switchToSpecificTab(1);
        tabHelper.closeCurrentTab();

//        driver.switchTo().window(tabsList.get(0));
//        System.out.println(driver.getCurrentUrl());

        tabHelper.switchToSpecificTab(0);

        //din cauza reclamei fortam site-ul sa acceseze un URL specific
        driver.navigate().to("https://demoqa.com/browser-windows");

        WebElement newWindowElement=driver.findElement(By.id("windowButton"));
        newWindowElement.click();

        System.out.println(driver.getCurrentUrl());

       // List<String> newWindowList= new ArrayList<>(driver.getWindowHandles());
        tabHelper.switchToSpecificTab(1);
        tabHelper.closeCurrentTab();
//        driver.switchTo().window(newWindowList.get(1));
//        System.out.println(driver.getCurrentUrl());
        tabHelper.switchToSpecificTab(0);

       // driver.close();
       // driver.switchTo().window(newWindowList.get(0));
       // System.out.println(driver.getCurrentUrl());

        //driver.quit();


    }
}