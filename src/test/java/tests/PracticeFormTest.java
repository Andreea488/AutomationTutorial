package tests;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test

    public void testMethod() {
       driver.get("https://demoqa.com/automation-practice-form");
       ElementHelper elementHelper = new ElementHelper(driver);//creare obiect
        AlertHelper alertHelper = new AlertHelper(driver);
        PageHelper pageHelper= new PageHelper(driver);

        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Andreea";
       //firstNameElement.sendKeys(firstNameValue);
        //elementHelper.pressElement(firstNameElement, Keys.ENTER);
       elementHelper.fillElement(firstNameElement, firstNameValue);

        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue = "Iurean";
      // lastNameElement.sendKeys(lastNameValue);
        elementHelper.fillElement(lastNameElement, lastNameValue);

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        String emailValue = "test@test.com";
      //  emailElement.sendKeys(emailValue);
        elementHelper.fillElement(emailElement, emailValue);

        WebElement mobileElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileValue = "0723456123";
        //mobileElement.sendKeys(mobileValue);
        elementHelper.fillElement(mobileElement, mobileValue);

        WebElement subjectsElement = driver.findElement(By.id("subjectsInput"));
        List<String> subjectsValue = Arrays.asList("Accounting", "Arts", "Maths");
        for (int index = 0; index < subjectsValue.size(); index++) {
//            elementHelper.fillElement(subjectsElement, subjectsValue.get(index));
//            elementHelper.pressElement(subjectsElement, Keys.ENTER);
           // subjectsElement.sendKeys(subjectsValue.get(index));
           // subjectsElement.sendKeys(Keys.ENTER);
            elementHelper.fillPressElement(subjectsElement,subjectsValue.get(index), Keys.ENTER);
        }
//        WebElement stateandCityElement = driver.findElement(By.id("react-select-3-input"));
//        String stateandCityValue = "NCR";
//        stateandCityElement.sendKeys(stateandCityValue);
//        stateandCityElement.sendKeys(Keys.ENTER);

        String genderValue = "Female";
        List<WebElement> genderElementList = driver.findElements(By.cssSelector("div[id='genterWrapper']>div>div>label[class='custom-control-label']"));
        switch (genderValue) {
            case "Male":
               // genderElementList.get(0).click();
                elementHelper.clickJSElement(genderElementList.get(0));
                break;
            case "Female":
               // genderElementList.get(1).click();
                elementHelper.clickJSElement(genderElementList.get(1));
                break;
            case "Other":
               // genderElementList.get(2).click();
                elementHelper.clickJSElement(genderElementList.get(2));
                break;
        }
        //facem scroll in jos
        //val pozitive merge in jos
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
        pageHelper.scrollPage(0,400);

        List<WebElement> hobbiesElementList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']"));
        List<String> hobbiesValue = Arrays.asList("Reading", "Music");
        for (int index = 0; index < hobbiesElementList.size(); index++) {
            if (hobbiesValue.contains(hobbiesElementList.get(index).getText())) {
                elementHelper.clickElement(hobbiesElementList.get (index));
               // hobbiesElementList.get(index).click();
            }
        }
        WebElement uplodElement = driver.findElement(By.id("uploadPicture"));
        String path = "src/test/resources";
        String uploadValue = "poza1.jpg";
        File file = new File(path + "/" +uploadValue);
        elementHelper.fillElement(uplodElement, file.getAbsolutePath());
        //uplodElement.sendKeys(file.getAbsolutePath());

        WebElement currentAdressElement = driver.findElement(By.id("currentAddress"));
        String currentAddressValue = "Str. Campului nr 20 et 5";
        elementHelper.fillElement(currentAdressElement, currentAddressValue);
       // currentAdressElement.sendKeys(currentAddressValue);

       //JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement stateElement = driver.findElement(By.id("state"));
//        executor.executeScript("arguments[0].click();", stateElement);
//        stateElement.click();
        elementHelper.clickJSElement(stateElement);

        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateValue = "Uttar Pradesh";
       // elementHelper.fillElement(stateInputElement, stateValue);
        elementHelper.fillPressElement(stateInputElement, stateValue, Keys.ENTER);
//        stateInputElement.sendKeys(stateValue);
//        stateInputElement.sendKeys(Keys.ENTER);

        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
        //executor.executeScript("arguments[0].click();", cityElement);
        elementHelper.clickJSElement(cityElement);

        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityValue = "Lucknow";
        elementHelper.fillPressElement(cityInputElement, cityValue, Keys.ENTER);
       // elementHelper.fillElement(cityInputElement, Keys.ENTER);
//        cityInputElement.sendKeys(cityValue);
//        cityInputElement.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        //executor.executeScript("arguments[0].click();", submitElement);
        elementHelper.clickJSElement(submitElement);

        //wait explicit
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));

        List<WebElement> tableDescriptionList= driver.findElements(By.xpath("//table//td[1]"));
        List<WebElement> tableValueList =driver.findElements(By.xpath("//table//td[2]"));

//        Assert.assertEquals(tableDescriptionList.get(0).getText(),"Student Name", "Student Name text is not displayed right in the table");
        elementHelper.validateElementEqualsText(tableDescriptionList.get(0), "Student Name");
//        Assert.assertTrue(tableValueList.get(0).getText().contains(firstNameValue), "First Name text is not displayed right in the table");
//        Assert.assertTrue(tableValueList.get(0).getText().contains(lastNameValue), "Last Name text is not displayed right in the table");
        elementHelper.validateElementContainsText(tableValueList.get(0), firstNameElement.getText());
        elementHelper.validateElementContainsText(tableValueList.get(0), lastNameElement.getText());

        elementHelper.validateElementEqualsText(tableDescriptionList.get(1), "Student Email");
        elementHelper.validateElementEqualsText(tableValueList.get(1), "test@test.com");
//        Assert.assertEquals(tableDescriptionList.get(1).getText(),"Student Email", "Email text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(1).getText(), emailValue, "Student Email text is not displayed right in the table");

//        Assert.assertEquals(tableDescriptionList.get(2).getText(),"Gender", "Gender text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(2).getText(), genderValue, "Gender text is not displayed right in the table");
        elementHelper.validateElementEqualsText(tableDescriptionList.get(2), "Gender");
        elementHelper.validateElementEqualsText(tableValueList.get(2), genderValue);

//        Assert.assertEquals(tableDescriptionList.get(3).getText(),"Mobile", "Mobile text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(3).getText(), mobileValue, "Mobile text is not displayed right in the table");
        elementHelper.validateElementEqualsText(tableDescriptionList.get(3),"Mobile");
        elementHelper.validateElementEqualsText(tableValueList.get(3), "0723456123");

//        Assert.assertEquals(tableDescriptionList.get(5).getText(),"Subjects", "Subjects text is not displayed right in the table");
//        String expectedSubjects = String.join(", ", subjectsValue);
//        Assert.assertEquals(tableValueList.get(5).getText(), expectedSubjects, "Subjects text is not displayed right in the table");
        String allSubjects = String.join(", ",subjectsValue);
        elementHelper.validateElementEqualsText(tableDescriptionList.get(5),"Subjects");
        elementHelper.validateElementEqualsText(tableValueList.get(5), allSubjects);

//        Assert.assertEquals(tableDescriptionList.get(6).getText(),"Hobbies", "Hobbies text is not displayed right in the table");
//        String expectedHobbies = String.join(", ", hobbiesValue);
//        Assert.assertEquals(tableValueList.get(6).getText(), expectedHobbies, "Hobbies text is not displayed right in the table");
        String allHobies = String.join(", ",hobbiesValue);
        elementHelper.validateElementEqualsText(tableDescriptionList.get(6), "Hobbies");
        elementHelper.validateElementEqualsText(tableValueList.get(6), allHobies);

//        Assert.assertEquals(tableDescriptionList.get(7).getText(),"Picture", "Upload picture text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(7).getText(), uploadValue, "Upload picture text is not displayed right in the table");
        String fileName = uploadValue;
        elementHelper.validateElementEqualsText(tableDescriptionList.get(7), "Picture");
        elementHelper.validateElementEqualsText(tableValueList.get(7), fileName);

//        Assert.assertEquals(tableDescriptionList.get(8).getText(),"Address", "Address text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(8).getText(), currentAddressValue, "Address text is not displayed right in the table");
        elementHelper.validateElementEqualsText(tableDescriptionList.get(8), "Address");
        elementHelper.validateElementEqualsText(tableValueList.get(8), currentAddressValue);

//        Assert.assertEquals(tableDescriptionList.get(9).getText(),"State and City", "State and city text is not displayed right in the table");
//        Assert.assertEquals(tableValueList.get(9).getText(), stateValue + " " + cityValue, "State and city text is not displayed right in the table");
        elementHelper.validateElementEqualsText(tableDescriptionList.get(9), "State and City");
        elementHelper.validateElementContainsText(tableValueList.get(9), stateValue);
        elementHelper.validateElementContainsText(tableValueList.get(9), cityValue);

       // driver.quit();
    }
}



