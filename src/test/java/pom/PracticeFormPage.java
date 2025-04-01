package pom;

import io.cucumber.java.sl.In;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PracticeFormPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement userEmailInput;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement radioButtonMale;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement dateBirthCalendar;

    @FindBy(xpath = "//*[@id='subjectsContainer']//input")
    private WebElement subjectsInput;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement checkboxHobbiesSports;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement chooseFileButton;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressTextArea;

    @FindBy(xpath = "//*[@id='state']/div/div[1]")
    private WebElement selectStateDropdown;

    @FindBy(xpath = "//div[contains(text(), 'NCR')]")
    private WebElement selectStateDropdownOption;

    @FindBy(xpath = "//*[@id='city']/div/div[1]")
    private WebElement selectCityDropdown;

    @FindBy(xpath = "//div[contains(text(), 'Delhi')]")
    private WebElement selectCityDropdownOption;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    //Result

    @FindBy(xpath = "//td[normalize-space()='Diego Galaz']")
    private WebElement resultStudentName;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarFirstName(String arg0) throws InterruptedException{
        try {
            if (firstNameInput.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(firstNameInput)).sendKeys(arg0);

            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarLastName(String arg0) throws InterruptedException{
        try {
            if(lastNameInput.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(lastNameInput)).sendKeys(arg0);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarEmail(String arg0) throws InterruptedException{
        try {
            if(userEmailInput.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(userEmailInput)).sendKeys(arg0);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void checkRadioButtonGenero() throws InterruptedException{
        try {
            if(radioButtonMale.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(radioButtonMale)).click();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarNumeroMovil(String arg0) throws InterruptedException{
        try {
            if(mobileNumberInput.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(mobileNumberInput)).sendKeys(arg0);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void addDateBirth(String arg0) {
        try {
            if(dateBirthCalendar.isDisplayed()){
                wait.until(ExpectedConditions.elementToBeClickable(dateBirthCalendar)).sendKeys(Keys.COMMAND + "a");
                wait.until(ExpectedConditions.elementToBeClickable(dateBirthCalendar)).sendKeys(arg0);
                wait.until(ExpectedConditions.elementToBeClickable(dateBirthCalendar)).sendKeys(Keys.ENTER);
                dateBirthCalendar.sendKeys(Keys.ENTER);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarSubjects(String arg0) throws InterruptedException{
        try {
            Thread.sleep(2000);
            if(subjectsInput.isDisplayed()){
                subjectsInput.click();
                Thread.sleep(5000);
                subjectsInput.sendKeys(arg0);
                subjectsInput.sendKeys(Keys.ENTER);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickCheckHobbies() throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(checkboxHobbiesSports.isDisplayed()){
                checkboxHobbiesSports.click();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void subirImagen() throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(chooseFileButton.isDisplayed()){
                String filePath = "/Users/vn53tjl/Documents/ProjectsAutomation/seleniumtestv2/src/test/resources/Files/image (123).png";
                chooseFileButton.sendKeys(filePath);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarCurrentAddress(String arg0) throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(currentAddressTextArea.isDisplayed()){
                currentAddressTextArea.sendKeys(arg0);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void selectState() throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(selectStateDropdown.isDisplayed()){
                selectStateDropdown.click();
                Thread.sleep(4000);
                selectStateDropdownOption.click();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void selectCity() throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(selectCityDropdown.isDisplayed()){
                selectCityDropdown.click();
                Thread.sleep(4000);
                selectCityDropdownOption.click();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickOnSubmitButton() throws InterruptedException{
        try {
            if (submitButton.isDisplayed()){
                submitButton.click();
                Thread.sleep(4000);

            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaStudentName(String arg0) throws InterruptedException{
        try {
            if(resultStudentName.isDisplayed()){
                String resultado = resultStudentName.getText();
                if(resultado.equals(arg0)){
                    System.out.println("Resultado validado");
                }else{
                    System.out.println("Resultado no validado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }











}
