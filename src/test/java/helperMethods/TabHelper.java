package helperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabHelper {

    public WebDriver driver;

    public TabHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToSpecificTab(int position) {
        //inlocuim codul
        //List<String> tabsList= new ArrayList<>(driver.getWindowHandles());
        //    driver.switchTo().window(tabsList.get(1));
        //    System.out.println(driver.getCurrentUrl());

        List<String> tabsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(position));
        //System.out.println(driver.getCurrentUrl());
    }
    public void closeCurrentTab(){
        driver.close();
    }
}
