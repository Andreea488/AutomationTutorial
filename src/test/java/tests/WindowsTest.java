package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
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
        driver.get("https://demoqa.com/");

        ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
        AlertHelper alertHelper = new AlertHelper(driver);
        PageHelper pageHelper= new PageHelper(driver);

        WebElement alerstWindowsElement=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
       // JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", alerstWindowsElement);
        elementHelper.clickJSElement(alerstWindowsElement);

        WebElement WindowsElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
       // executor.executeScript("arguments[0].click();", WindowsElement);
        elementHelper.clickJSElement(WindowsElement);

        WebElement newtabElement= driver.findElement(By.id("tabButton"));
        //executor.executeScript("arguments[0].click();", newtabElement);
        newtabElement.click();
        System.out.println(driver.getCurrentUrl());

        List<String> tabsList= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));
        System.out.println(driver.getCurrentUrl());

        //inchidere tab
        driver.close();
        driver.switchTo().window(tabsList.get(0));
        System.out.println(driver.getCurrentUrl());

        //din cauza reclamei fortam site-ul sa acceseze un URL specific
        driver.navigate().to("https://demoqa.com/browser-windows");

        WebElement newWindowElement=driver.findElement(By.id("windowButton"));
        newWindowElement.click();

        System.out.println(driver.getCurrentUrl());

        List<String> newWindowList= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newWindowList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(newWindowList.get(0));
        System.out.println(driver.getCurrentUrl());

        //driver.quit();







    }
}