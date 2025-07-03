package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.List;

public class WebTablesTest extends SharedData {

        @Test

        public void testMethod () {
                ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
                AlertHelper alertHelper = new AlertHelper(driver);
                PageHelper pageHelper= new PageHelper(driver);

        //accesam o pagina specifica
        //driver.get("https://demoqa.com/webtables");
               // driver.get("https://demoqa.com");

        //WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].click();", formsMenuElement);
        //elementHelper.clickJSElement(formsMenuElement);

       // WebElement practiceFormElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
      //  executor.executeScript("arguments[0].click();", practiceFormElement);
        //elementHelper.clickJSElement(practiceFormElement);

       // driver.get("https://demoqa.com");

        //facem browser-ul in modul maximize
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        // JavascriptExecutor executor = (JavascriptExecutor) driver;
       // executor.executeScript("arguments[0].click();", elementsMenu);
        // elementsMenu.click();
         elementHelper.clickJSElement(elementsMenu);


        WebElement webTablesElement = driver.findElement(By.xpath("//span[text()='Web Tables']"));
       // executor.executeScript("arguments[0].click();", webTablesElement);
         elementHelper.clickJSElement(webTablesElement);

        List<WebElement> tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        int tableSize = 3;
//        Assert.assertEquals(tableList.size(), tableSize);
        elementHelper.validateListSize(tableList, tableSize);

//        List<WebElement> tableList=driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
//        int tableSize= 2;
//        Assert.assertEquals(tableList.size(), tableSize, "Expected table size: " +tableSize + "is not correct");

        //identificam un element
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        //addElement.click();
                elementHelper.clickJSElement(addElement);

        WebElement firstnameElement = driver.findElement(By.id("firstName"));
        String firstnameValue = "Andreea";
        //firstnameElement.sendKeys(firstnameValue);
                elementHelper.fillElement(firstnameElement, firstnameValue);

        WebElement lastnameElement = driver.findElement(By.id("lastName"));
        String lastnameValue = "Iurean";
       // lastnameElement.sendKeys(lastnameValue);
                elementHelper.fillElement(lastnameElement, lastnameValue);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String emailValue = "test@test.com";
        //emailElement.sendKeys(emailValue);
                elementHelper.fillElement(emailElement, emailValue);

        WebElement ageElement = driver.findElement(By.id("age"));
        String ageValue = "27";
        //ageElement.sendKeys(ageValue);
                elementHelper.fillElement(ageElement, ageValue);

        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salaryValue = "2500";
      //  salaryElement.sendKeys(salaryValue);
                elementHelper.fillElement(salaryElement, salaryValue);

        WebElement departamentElement = driver.findElement(By.id("department"));
        String departamentValue = "financiar";
        //departamentElement.sendKeys(departamentValue);
                elementHelper.fillElement(departamentElement, departamentValue);
        // JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement addLine = driver.findElement(By.id("submit"));
        //executor.executeScript("arguments[0].click();", addLine);
         elementHelper.clickJSElement(addLine);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
//        Assert.assertEquals(tableList.size(), tableSize + 1);
          elementHelper.validateListSize(tableList, tableSize+1);
      //  Assert.assertTrue(tableList.get(tableSize).getText().contains(firstnameValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(lastnameValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(emailValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(ageValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(salaryValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(departamentValue));
        elementHelper.validateElementContainsText(tableList.get(tableSize), firstnameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), lastnameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), emailValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), ageValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), salaryValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), departamentValue);

        // edit functionality
        WebElement editElement = driver.findElement(By.id("edit-record-4"));
       // editElement.click();
                elementHelper.clickElement(editElement);

        WebElement editFirstNameElement = driver.findElement(By.id("firstName"));
        String editFirstNameValue = "Andreea";
        editFirstNameElement.clear();
       // editFirstNameElement.sendKeys(editFirstNameValue);
                elementHelper.clearFillElement(editFirstNameElement,editFirstNameValue);

        WebElement editLastNameElement = driver.findElement(By.id("lastName"));
        String editLastNameValue = "Iurean";
       // editLastNameElement.clear();
       // editLastNameElement.sendKeys(editLasttNameValue);
                elementHelper.clearFillElement(editLastNameElement, editLastNameValue);

        WebElement editemailElement = driver.findElement(By.id("userEmail"));
        String editemailValue = "test@test.com";
        editemailElement.clear();
        //editemailElement.sendKeys(editemailValue);
                elementHelper.clearFillElement(editemailElement, editemailValue);

        WebElement editageElement = driver.findElement(By.id("age"));
        String editageValue = "27";
        editageElement.clear();
       // editageElement.sendKeys(editageValue);
                elementHelper.clearFillElement(editageElement, editageValue);

        WebElement editsalaryElement = driver.findElement(By.id("salary"));
        String editsalarylValue = "2500";
        editsalaryElement.clear();
        //editsalaryElement.sendKeys(editsalarylValue);
                elementHelper.clearFillElement(editsalaryElement, editsalarylValue);

        WebElement editdepartamentElement = driver.findElement(By.id("department"));
        String editdepartmentValue = "financiar";
        editdepartamentElement.clear();
      //  editdepartamentElement.sendKeys(editdepartmentValue);
                elementHelper.clearFillElement(editdepartamentElement, editdepartmentValue);

        WebElement editLine = driver.findElement(By.id("submit"));
       // executor.executeScript("arguments[0].click();", editLine);
        elementHelper.clickJSElement(editLine);

        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
      //  Assert.assertEquals(tableList.size(), tableSize + 1);
                elementHelper.validateListSize(tableList, tableSize+ 1);
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editFirstNameValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editLastNameValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editemailValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editageValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editsalarylValue));
//        Assert.assertTrue(tableList.get(tableSize).getText().contains(editdepartmentValue));
                elementHelper.validateElementContainsText(tableList.get(tableSize), editFirstNameValue);
                elementHelper.validateElementContainsText(tableList.get(tableSize), editLastNameValue);
                elementHelper.validateElementContainsText(tableList.get(tableSize), editemailValue);
                elementHelper.validateElementContainsText(tableList.get(tableSize), editageValue);
                elementHelper.validateElementContainsText(tableList.get(tableSize), editsalarylValue);
                elementHelper.validateElementContainsText(tableList.get(tableSize), editdepartmentValue);


        //delete element
        WebElement deleteElement = driver.findElement(By.id("delete-record-4"));
        //deleteElement.click();
                elementHelper.clickJSElement(deleteElement);


        tableList = driver.findElements(By.xpath("//div[@class='rt-tr -even'or @class='rt-tr -odd']"));
        //Assert.assertEquals(tableList.size(), tableSize);

        elementHelper.validateListSize(tableList, tableSize);
       // driver.quit();
    }

}
