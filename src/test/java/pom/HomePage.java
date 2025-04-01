package pom;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePage extends BasePage {

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement logoDemoQA;

    @FindBy(xpath = "//h5[normalize-space()='Elements']")
    private WebElement elementsSection;

    @FindBy(xpath = "//h5[normalize-space()='Forms']")
    private WebElement formsSection;

    @FindBy(xpath = "//h5[normalize-space()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsSection;

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6' and contains(text(), 'Please')]")
    private WebElement tituloElementsSection;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
    private WebElement textBoxSection;

    @FindBy(xpath = "//li[@id='item-0']//span[text()='Text Box']")
    private WebElement menuTextBox;

    @FindBy(xpath = "//span[normalize-space()='Check Box']")
    private WebElement menuCheckBox;

    @FindBy(xpath = "//span[normalize-space()='Radio Button']")
    private WebElement menuRadioButton;

    @FindBy(xpath = "//span[normalize-space()='Web Tables']")
    private WebElement menuWebTables;

    @FindBy(xpath = "//span[normalize-space()='Buttons']")
    private WebElement menuButtons;

    @FindBy(xpath = "//span[normalize-space()='Links']")
    private WebElement menuLinks;

    @FindBy(xpath = "//span[normalize-space()='Upload and Download']")
    private WebElement menuUploadDownload;

    //Forms Section
    @FindBy(xpath = "//span[normalize-space()='Practice Form']")
    private WebElement menuPracticeForm;

    //Elements Text Box Section

    @FindBy(id = "userName")
    private WebElement textBoxUserName;

    @FindBy(id = "userEmail")
    private WebElement textBoxEmail;

    @FindBy(id = "currentAddress")
    private WebElement textBoxCurrentAddress;

    @FindBy (id = "permanentAddress")
    private WebElement textBoxPermanentAddress;

    @FindBy (xpath = "//button[@id='submit']")
    private WebElement buttonSubmitTextBox;

    @FindBy(xpath = "//p[@id='name' and starts-with(text(), 'Name:')]")
    private WebElement resultadoName;

    @FindBy(xpath = "//p[@id='email' and starts-with(text(), 'Email:')]")
    private WebElement resultadoEmail;

    @FindBy(xpath = "//p[@id='currentAddress' and starts-with(text(), 'Current Address :')]")
    private WebElement resultadoCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress' and starts-with(text(), 'Permananet Address :')]")
    private WebElement resultadoPermanentAddress;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void ingresarDemoQa(){
        try{
            if(logoDemoQA.isDisplayed()){
                enmarcarObjeto(logoDemoQA);
                takeScreenshot();
                desenmarcarObjeto(logoDemoQA);
                System.out.println("Se ingreso a DemoQA Exitosamente");
            }
        } catch (Exception e) {
           throw e;
        }
    }

    //Elements Section

    public void ingresarElementsSection() throws InterruptedException {
        try{
            if(elementsSection.isDisplayed()){
                elementsSection.click();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Forms Section

    public void ingresarFormsSection() throws InterruptedException{
        try {
            if(formsSection.isDisplayed()){
                formsSection.click();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Alerts, Frame & Windows Section

    public void ingresarAlertsFrameWindowsSection() throws InterruptedException{
        try {
            if(alertsFrameWindowsSection.isDisplayed()){
                alertsFrameWindowsSection.click();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void visualizarTituloElements(String arg0) throws Exception{
        try{
            Thread.sleep(3000);
            if(tituloElementsSection.isDisplayed()){
                String texto = tituloElementsSection.getText();
                if(texto.equals(arg0)){
                    System.out.println("Texto Validado");
                }else {
                    System.out.println("Texto incorrecto");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void seleccionarOpcionMenuElements(String arg0) throws InterruptedException{
        try{
            Thread.sleep(10000);
            switch (arg0){
                case "Text Box":
                    if(menuTextBox.isDisplayed()){
                        menuTextBox.click();
                        System.out.println("Se pulso Menu Text Box");
                    }
                    break;
                case "Check Box":
                    if(menuCheckBox.isDisplayed()){
                        menuCheckBox.click();
                        System.out.println("Se pulso Menu Check Box");
                    }
                    break;
                case "Radio Button":
                    if(menuRadioButton.isDisplayed()){
                        menuRadioButton.click();
                        Thread.sleep(5000);
                        System.out.println("Se pulso Menu Radio Button");
                    }
                    break;
                case "Web Tables":
                    if(menuWebTables.isDisplayed()){
                        menuWebTables.click();
                        Thread.sleep(5000);
                        System.out.println("Se pulso Menu Web Tables");
                    }
                    break;
                case "Buttons":
                    if(menuButtons.isDisplayed()){
                        menuButtons.click();
                        Thread.sleep(5000);
                        System.out.println("Se pulso Menu Buttons");
                    }
                    break;
                case "Links":
                    if(menuLinks.isDisplayed()){
                        menuLinks.click();
                        Thread.sleep(5000);
                        System.out.println("Se pulso Menu Links");
                    }
                    break;
                case "UploadAndDownload":
                    if(menuUploadDownload.isDisplayed()){
                        menuUploadDownload.click();
                        Thread.sleep(5000);
                        System.out.println("Se pulso Menu Upload and Download");
                    }
                    break;

            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void seleccionarOpcionMenu() throws InterruptedException{
        try {
            if(menuPracticeForm.isDisplayed()){
                menuPracticeForm.click();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarFullNameTextBox(String arg0) throws InterruptedException{
        try {
            Thread.sleep(3000);
            if(textBoxUserName.isDisplayed()){
                textBoxUserName.sendKeys(arg0);
            }
        }catch (Exception e){
            throw e;
        }
    }

    public void ingresarEmailTextBox(String arg0) throws InterruptedException {
        try{
            Thread.sleep(3000);
            if(textBoxEmail.isDisplayed()){
                textBoxEmail.sendKeys(arg0);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarCurrentAddressTextBox(String arg0) throws InterruptedException{
        try{
            Thread.sleep(3000);
            if(textBoxCurrentAddress.isDisplayed()){
                textBoxCurrentAddress.sendKeys(arg0);
            }
        } catch (Exception e){
            throw e;
        }
    }

    public void ingresarPermanentAddressTextBox(String arg0) throws InterruptedException{
        try{
            Thread.sleep(3000);
            if(textBoxPermanentAddress.isDisplayed()){
                textBoxPermanentAddress.sendKeys(arg0);
                Thread.sleep(3000);
            }
        }catch (Exception e){
            throw e;
        }
    }

    public void presionarBotonSubmit() throws InterruptedException{
        try {
            if(buttonSubmitTextBox.isDisplayed()){
                buttonSubmitTextBox.click();
                Thread.sleep(3000);
            }
        }catch (Exception e){
            throw e;
        }
    }

    public void validarNombreIngresado(String arg0){
        try{
            if(resultadoName.isDisplayed()){
                String textoActual = resultadoName.getText();
                String actualValue = textoActual.replace("Name:", "").trim();
                //Asserts
                //String textoAssert = "Name:Prueba Selenium";
                //Assert.assertEquals(textoActual, textoAssert);
                //System.out.println("AssertEquals ok");

                if(actualValue.equals(arg0)){
                    System.out.println("Nombre es igual");
                }else {
                    System.out.println("Nombre no es igual");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validarEmailIngresado(String arg0){
        try{
            if(resultadoEmail.isDisplayed()){
                String textoActual = resultadoEmail.getText();
                String actualValue = textoActual.replace("Email:", "").trim();

                if(actualValue.equals(arg0)){
                    System.out.println("Correo es igual");
                }else{
                    System.out.println("Correo no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void validarCurrentAddressIngresado(String arg0){
        try{
            if(resultadoCurrentAddress.isDisplayed()){
                String textoActual = resultadoCurrentAddress.getText();
                String actualValue = textoActual.replace("Current Address :", "").trim();

                if(actualValue.equals(arg0)){
                    System.out.println("Current Address es igual");
                }else{
                    System.out.println("Current Address no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void validarPermanentAddressIngresado(String arg0){
        try{
            if(resultadoPermanentAddress.isDisplayed()){
                String textoActual = resultadoPermanentAddress.getText();
                String actualValue = textoActual.replace("Permananet Address :", "").trim();

                if(actualValue.equals(arg0)){
                    System.out.println("Permanent Address es igual");
                }else{
                    System.out.println("Permanent Address no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }






}
