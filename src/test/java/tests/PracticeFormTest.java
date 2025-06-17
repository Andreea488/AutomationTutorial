package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;

    @Test

    public void testMethod() {
        //deschidem o instanta de Chrome
        driver = new ChromeDriver();

        //accesam o pagina specifica
        driver.get("https://demoqa.com/automation-practice-form");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();
        //wait implicit
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Andreea";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue = "Iurean";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        String emailValue = "test@test.com";
        emailElement.sendKeys(emailValue);

        WebElement mobileElement = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileValue = "0723456123";
        mobileElement.sendKeys(mobileValue);

        WebElement subjectsElement = driver.findElement(By.id("subjectsInput"));
        List<String> subjectsValue = Arrays.asList("Accounting", "Arts", "Maths");
        for (int index = 0; index < subjectsValue.size(); index++) {
            subjectsElement.sendKeys(subjectsValue.get(index));
            subjectsElement.sendKeys(Keys.ENTER);
        }
//        WebElement stateandCityElement = driver.findElement(By.id("react-select-3-input"));
//        String stateandCityValue = "NCR";
//        stateandCityElement.sendKeys(stateandCityValue);
//        stateandCityElement.sendKeys(Keys.ENTER);

        String genderValue = "Female";
        List<WebElement> genderElementList = driver.findElements(By.cssSelector("div[id='genterWrapper']>div>div>label[class='custom-control-label']"));
        switch (genderValue) {
            case "Male":
                genderElementList.get(0).click();
                break;
            case "Female":
                genderElementList.get(1).click();
                break;
            case "Other":
                genderElementList.get(2).click();
                break;
        }
        //facem scroll in jos
        //val pozitive merge in jos
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        List<WebElement> hobbiesElementList = driver.findElements(By.cssSelector("div[id='hobbiesWrapper']>div>div>label[class='custom-control-label']"));
        List<String> hobbiesValue = Arrays.asList("Reading", "Music");
        for (int index = 0; index < hobbiesElementList.size(); index++) {
            if (hobbiesValue.contains(hobbiesElementList.get(index).getText())) {
                hobbiesElementList.get(index).click();
            }

        }
        WebElement uplodElement = driver.findElement(By.id("uploadPicture"));
        String path = "src/test/resources";
        String uploadValue = "poza1.jpg";
        File file = new File(path + "/" +uploadValue);
        uplodElement.sendKeys(file.getAbsolutePath());

        WebElement currentAdressElement = driver.findElement(By.id("currentAddress"));
        String currentAddressValue = "Str. Campului nr 20 et 5";
        currentAdressElement.sendKeys(currentAddressValue);

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement stateElement = driver.findElement(By.id("state"));
        executor.executeScript("arguments[0].click();", stateElement);
        stateElement.click();


        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateValue = "Uttar Pradesh";
        stateInputElement.sendKeys(stateValue);
        stateInputElement.sendKeys(Keys.ENTER);

        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
        executor.executeScript("arguments[0].click();", cityElement);

        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityValue = "Lucknow";
        cityInputElement.sendKeys(cityValue);
        cityInputElement.sendKeys(Keys.ENTER);

        WebElement submitElement = driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click();", submitElement);

        //wait explicit
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//td[1]")));


        List<WebElement> tableDescriptionList= driver.findElements(By.xpath("//table//td[1]"));
        List<WebElement> tableValueList =driver.findElements(By.xpath("//table//td[2]"));

        Assert.assertEquals(tableDescriptionList.get(0).getText(),"Student Name", "Student Name text is not displayed right in the table");
        Assert.assertTrue(tableValueList.get(0).getText().contains(firstNameValue), "First Name text is not displayed right in the table");
        Assert.assertTrue(tableValueList.get(0).getText().contains(lastNameValue), "Last Name text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(1).getText(),"Student Email", "Email text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(1).getText(), emailValue, "Student Email text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(2).getText(),"Gender", "Gender text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(2).getText(), genderValue, "Gender text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(3).getText(),"Mobile", "Mobile text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(3).getText(), mobileValue, "Mobile text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(5).getText(),"Subjects", "Subjects text is not displayed right in the table");
        String expectedSubjects = String.join(", ", subjectsValue);
        Assert.assertEquals(tableValueList.get(5).getText(), expectedSubjects, "Subjects text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(6).getText(),"Hobbies", "Hobbies text is not displayed right in the table");
        String expectedHobbies = String.join(", ", hobbiesValue);
        Assert.assertEquals(tableValueList.get(6).getText(), expectedHobbies, "Hobbies text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(7).getText(),"Picture", "Upload picture text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(7).getText(), uploadValue, "Upload picture text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(8).getText(),"Address", "Address text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(8).getText(), currentAddressValue, "Address text is not displayed right in the table");

        Assert.assertEquals(tableDescriptionList.get(9).getText(),"State and City", "State and city text is not displayed right in the table");
        Assert.assertEquals(tableValueList.get(9).getText(), stateValue + " " + cityValue, "State and city text is not displayed right in the table");

        driver.quit();









    }

}


