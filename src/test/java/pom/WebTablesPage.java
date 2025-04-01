package pom;

import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage  extends BasePage{

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement addNewRecordButton;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement inputUserEmail;

    @FindBy(xpath = "//input[@id='age']")
    private WebElement inputAge;

    @FindBy(xpath = "//input[@id='salary']")
    private WebElement inputSalary;

    @FindBy(xpath = "//input[@id='department']")
    private WebElement inputDepartment;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//input[@id='searchBox']")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@class='rt-td' and contains(text(), 'Die')]")
    private WebElement nameSearch;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M880 836H1')]")
    private WebElement botonEditar;

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public void addNewRecordButton() throws InterruptedException{
        try {
            if(addNewRecordButton.isDisplayed()){
                addNewRecordButton.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarFirstName(String arg0) throws InterruptedException{
        try {
            if(inputFirstName.isDisplayed()){
                inputFirstName.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarLastName(String arg0) throws  InterruptedException{
        try {
            if(inputLastName.isDisplayed()){
                inputLastName.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarEmail(String arg0) throws  InterruptedException{
        try {
            if(inputUserEmail.isDisplayed()){
                inputUserEmail.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarAge(String arg0) throws InterruptedException{
        try {
            if(inputAge.isDisplayed()){
                inputAge.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarSalary(String arg0) throws InterruptedException{
        try {
            if(inputSalary.isDisplayed()){
                inputSalary.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarDepartment(String arg0) throws InterruptedException{
        try {
            if(inputDepartment.isDisplayed()){
                inputDepartment.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickSubmitButton() throws InterruptedException{
        try {
            if(buttonSubmit.isDisplayed()){
                buttonSubmit.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void searchBox(String arg0) throws  InterruptedException{
        try {
            if(searchBox.isDisplayed()){
                searchBox.sendKeys(arg0);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaBusquedaCoincide(String arg0) throws InterruptedException{
        try {
            if(nameSearch.isDisplayed()){
                String textoActual = nameSearch.getText();
                String textoEsperado = "Diego";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Resultado busqueda es el esperado");
                }else{
                    System.out.println("Resultado busqueda no es el esperado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarBusquedaButton() throws InterruptedException{
        try {
            if(botonEditar.isDisplayed()){
                botonEditar.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarRegistro(String arg0) throws InterruptedException{
        try {
            if(inputAge.isDisplayed()){
                inputAge.clear();
                Thread.sleep(3000);
                inputAge.sendKeys(arg0);
                Thread.sleep(3000);
                buttonSubmit.click();
                Thread.sleep(2500);
                System.out.println("Se edita registro");

            }
        } catch (Exception e) {
            throw e;
        }
    }


}
