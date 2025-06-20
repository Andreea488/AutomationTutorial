package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest {
    public WebDriver driver;

    @Test

    public void testMethod() {
        //deschidem o instanta de Chrome
        driver = new ChromeDriver();

        //accesam o pagina specifica
        driver.get("https://demoqa.com/");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        WebElement alerstWindowsElement=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", alerstWindowsElement);

        WebElement WindowsElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        executor.executeScript("arguments[0].click();", WindowsElement);

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

        driver.quit();







    }
}