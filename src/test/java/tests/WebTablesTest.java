package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest {
    public WebDriver driver;

    @Test

    public void testMethod(){
        //deschidem o instanta de Chrome
        driver=new ChromeDriver();

        driver.get("https://demoqa.com/");

        //accesam o pagina specifica
        //driver.get("https://demoqa.com/webtables");

        WebElement formsMenuElement=driver.findElement(By.xpath("//h5[text()='Forms']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", formsMenuElement);

        WebElement practiceFormElement= driver.findElement(By.xpath("//span[text()='Practice Form']"));
        executor.executeScript("arguments[0].click();", practiceFormElement);

        driver.get("https://demoqa.com");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        WebElement elementsMenu=driver.findElement(By.xpath("//h5[text()='Elements']"));
       // JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementsMenu);
       // elementsMenu.click();


        WebElement webTablesElement=driver.findElement(By.xpath("//span[text()='Web Tables']"));
        executor.executeScript("arguments[0].click();", webTablesElement);

        List<WebElement> tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        int tableSize=3;
        Assert.assertEquals(tableList.size(), tableSize);

//        List<WebElement> tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
//        int tableSize= 2;
//        Assert.assertEquals(tableList.size(), tableSize, "Expected table size: " +tableSize + "is not correct");

        //identificam un element
        WebElement addElement=driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstnameElement=driver.findElement(By.id("firstName"));
        String firstnameValue="Andreea";
        firstnameElement.sendKeys(firstnameValue);

        WebElement lastnameElement=driver.findElement(By.id("lastName"));
        String lastnameValue="Iurean";
        lastnameElement.sendKeys(lastnameValue);

        WebElement emailElement=driver.findElement(By.id("userEmail"));
        String emailValue="test@test.com";
        emailElement.sendKeys(emailValue);

        WebElement ageElement=driver.findElement(By.id("age"));
        String ageValue="27";
        ageElement.sendKeys(ageValue);

        WebElement salaryElement=driver.findElement(By.id("salary"));
        String salaryValue="2500";
        salaryElement.sendKeys(salaryValue);

        WebElement departamentElement=driver.findElement(By.id("department"));
        String departamentValue="financiar";
        departamentElement.sendKeys(departamentValue);

       // JavascriptExecutor executor = (JavascriptExecutor) driver;
        
        WebElement addLine=driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click();", addLine);

        tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(), tableSize+1 );
        Assert.assertTrue(tableList.get(tableSize).getText().contains(firstnameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(lastnameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(emailValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(ageValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(salaryValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(departamentValue));

        // edit functionality
        WebElement editElement=driver.findElement(By.id("edit-record-4"));
        editElement.click();

        WebElement editFirstNameElement=driver.findElement(By.id("firstName"));
        String editFirstNameValue="Andreea";
        editFirstNameElement.clear();
        editFirstNameElement.sendKeys(editFirstNameValue);

        WebElement editLasttNameElement=driver.findElement(By.id("lastName"));
        String editLasttNameValue="Iurean";
        editLasttNameElement.clear();
        editLasttNameElement.sendKeys(editLasttNameValue);

        WebElement editemailElement=driver.findElement(By.id("userEmail"));
        String editemailValue="test@test.com";
        editemailElement.clear();
        editemailElement.sendKeys(editemailValue);

        WebElement editageElement=driver.findElement(By.id("age"));
        String editageValue="27";
        editageElement.clear();
        editageElement.sendKeys(editageValue);

        WebElement editsalaryElement=driver.findElement(By.id("salary"));
        String editsalarylValue="2500";
        editsalaryElement.clear();
        editsalaryElement.sendKeys(editsalarylValue);

        WebElement editdepartamentElement=driver.findElement(By.id("department"));
        String editdepartmentValue="financiar";
        editdepartamentElement.clear();
        editdepartamentElement.sendKeys(editdepartmentValue);

        WebElement editLine=driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click();", editLine);

        tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(), tableSize+1 );
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editFirstNameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editLasttNameValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editemailValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editageValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editsalarylValue));
        Assert.assertTrue(tableList.get(tableSize).getText().contains(editdepartmentValue));

        //delete element
        WebElement deleteElement=driver.findElement(By.id("delete-record-4"));
        deleteElement.click();

        tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        Assert.assertEquals(tableList.size(), tableSize);

        driver.quit();
    }
}
