package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {

    //Elements Check Box Section

    @FindBy(xpath = "//span[@class='rct-checkbox']//*[name()='svg']")
    private WebElement checkboxHome;

    @FindBy(xpath = "//div[@class='display-result mt-4']")
    private WebElement resultHome;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/span/button")
    private WebElement xpandListCheckbox;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[1]/span/button")
    private WebElement checkboxDesktop;

    @FindBy(xpath = "//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")
    private WebElement checkboxDesktop2;

    @FindBy(xpath = "//div[@class='display-result mt-4']" )
    private WebElement resultDesktop;

    @FindBy(xpath = "//li[2]//span[1]//button[1]//*[name()='svg']")
    private WebElement checkboxDocuments;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/button")
    private WebElement checkBoxDocuments2;

    @FindBy(xpath = "//label[@for='tree-node-react']//span[@class='rct-checkbox']//*[name()='svg']")
    private WebElement reactElement;

    @FindBy(xpath = "//div[@class='display-result mt-4']" )
    private WebElement resultDocument;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckBoxHome() throws InterruptedException{
        try{
            if(checkboxHome.isDisplayed()){
                checkboxHome.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaResultadoHomeEsValido(String arg0){
        try{
            if(resultHome.isDisplayed()){
                String textoActual = resultHome.getText();
                //System.out.println(textoActual);

                String textoEsperado = "You have selected :\n" +
                        "home\n" +
                        "desktop\n" +
                        "notes\n" +
                        "commands\n" +
                        "documents\n" +
                        "workspace\n" +
                        "react\n" +
                        "angular\n" +
                        "veu\n" +
                        "office\n" +
                        "public\n" +
                        "private\n" +
                        "classified\n" +
                        "general\n" +
                        "downloads\n" +
                        "wordFile\n" +
                        "excelFile";

                //System.out.println(textoEsperado);

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Result es igual");
                }else{
                    System.out.println("Result no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void desmarcaHomeCheckbox() throws InterruptedException{
        try {
            if(checkboxHome.isDisplayed()){
                checkboxHome.click();
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void xpandListCheckbox() throws InterruptedException{
        try {
            if(xpandListCheckbox.isDisplayed()){
                xpandListCheckbox.click();
                Thread.sleep(3000);
            }
        }catch (Exception e){
            throw e;
        }
    }

    public void selectCheckBoxDesktop() throws InterruptedException{
        try{
            if(checkboxDesktop.isDisplayed()){
                checkboxDesktop.click();
                Thread.sleep(3000);
                checkboxDesktop2.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaResultadoDesktop(String arg0){
        try{
            if(resultDesktop.isDisplayed()){
                String textoActual = resultDesktop.getText();
                String textoEsperado = "You have selected :\n" +
                        "desktop\n" +
                        "notes\n" +
                        "commands";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Resultado Desktop es igual");
                }else{
                    System.out.println("Resultado Desktop no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void desmarcarCheckboxDesktop() throws InterruptedException{
        try {
            if(checkboxDesktop2.isDisplayed()){
                checkboxDesktop2.click();
                Thread.sleep(4000);
                checkboxDesktop.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void xpanListCheckboxDocuments() throws InterruptedException{
        try {
            if(checkboxDocuments.isDisplayed()){
                checkboxDocuments.click();
                Thread.sleep(3000);
                checkBoxDocuments2.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void seleccionarReact() throws InterruptedException{
        try {
            if(reactElement.isDisplayed()){
                reactElement.click();
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaResultadoDocuments(String arg0) throws InterruptedException{
        try{
            if(resultDocument.isDisplayed()){
                String textoActual = resultDocument.getText();
                String textoEsperado = "You have selected :\n" +
                        "react";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Resultado Documents es igual");
                }else{
                    System.out.println("Resultado Documents no es igual");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }



}
