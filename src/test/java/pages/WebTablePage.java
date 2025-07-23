package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='rt-tr -even'or @class='rt-tr -odd']")
    private List<WebElement> tableList;
    @FindBy(id = "addNewRecordButton")
    private WebElement addElement;
    @FindBy(id = "firstName")
    private WebElement firstnameElement;
    @FindBy(id = "lastName")
    private WebElement lastnameElement;
    @FindBy(id = "userEmail")
    private WebElement emailElement;
    @FindBy(id = "age")
    private WebElement ageElement;
    @FindBy(id = "salary")
    private WebElement salaryElement;
    @FindBy(id = "department")
    private WebElement departamentElement;
    @FindBy(id = "submit")
    private WebElement submitElement;
    @FindBy(id = "edit-record-4")
    private WebElement editElement;
    @FindBy(id = "firstName")
    private WebElement editfirstnameElement;
    @FindBy(id = "lastName")
    private WebElement editlastnameElement;
    @FindBy(id = "userEmail")
    private WebElement editemailElement;
    @FindBy(id = "age")
    private WebElement editageElement;
    @FindBy(id = "salary")
    private WebElement editsalaryElement;
    @FindBy(id = "department")
    private WebElement editdepartamentElement;
    @FindBy(id = "delete-record-4")
    private WebElement deleteElement;

    public void addNewEntry(int tableSize, String firstNameValue, String lastNameValue, String emailValue, String ageValue, String salaryValue, String departmentValue) {
        elementHelper.validateListSize(tableList, tableSize);
        clickAddButton();
        fillFirstName(firstNameValue);
        fillLastName(lastNameValue);
        fillEmail(emailValue);
        fillAge(ageValue);
        fillSalary(salaryValue);
        fillDepartment(departmentValue);
        clickSubmit();

        elementHelper.validateListSize(tableList, tableSize + 1);
        elementHelper.validateElementContainsText(tableList.get(tableSize), firstNameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), lastNameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), emailValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), ageValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), salaryValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), departmentValue);
    }

    public void editNewEntry(int tableSize, String editFirstNameValue, String editLastNameValue, String editemailValue, String editageValue, String editsalarylValue, String editdepartmentValue) {
        clickEditButton();
        fillEditFirstName(editFirstNameValue);
        fillEditLastName(editLastNameValue);
        fillEditEmail(editemailValue);
        fillEditAge(editageValue);
        fillEditSalary(editsalarylValue);
        fillEditDepartment(editdepartmentValue);
        clickSubmit();

        elementHelper.validateListSize(tableList, tableSize + 1);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editFirstNameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editLastNameValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editemailValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editageValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editsalarylValue);
        elementHelper.validateElementContainsText(tableList.get(tableSize), editdepartmentValue);

    }

    public void deleteNewEntry(int tableSize) {
        clickDeleteButton();
        elementHelper.validateListSize(tableList, tableSize);
    }

    public void clickAddButton() {
        elementHelper.clickElement(addElement);
    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.clearFillElement(firstnameElement, firstNameValue);
    }

    public void fillLastName(String lastNameValue) {
        elementHelper.clearFillElement(lastnameElement, lastNameValue);
    }

    public void fillEmail(String emailValue) {
        elementHelper.clearFillElement(emailElement, emailValue);
    }

    public void fillAge(String ageValue) {
        elementHelper.clearFillElement(ageElement, ageValue);
    }

    public void fillSalary(String salaryValue) {
        elementHelper.clearFillElement(salaryElement, salaryValue);
    }

    public void fillDepartment(String departmentValue) {
        elementHelper.clearFillElement(departamentElement, departmentValue);
    }

    public void clickSubmit() {
        elementHelper.clickElement(submitElement);
    }

    public void clickEditButton() {
        elementHelper.clickJSElement(editElement);
    }

    public void fillEditFirstName(String firstNameValue) {
        elementHelper.clearFillElement(editfirstnameElement, firstNameValue);
    }

    public void fillEditLastName(String lastNameValue) {
        elementHelper.clearFillElement(editlastnameElement, lastNameValue);
    }

    public void fillEditEmail(String emailValue) {
        elementHelper.clearFillElement(editemailElement, emailValue);
    }

    public void fillEditAge(String ageValue) {
        elementHelper.clearFillElement(editageElement, ageValue);
    }

    public void fillEditSalary(String salaryValue) {
        elementHelper.clearFillElement(editsalaryElement, salaryValue);
    }

    public void fillEditDepartment(String departmentValue) {
        elementHelper.clearFillElement(editdepartamentElement, departmentValue);
    }
    public void clickDeleteButton(){
        elementHelper.clickJSElement(deleteElement);
    }
}

