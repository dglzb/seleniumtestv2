package pom;

import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage extends BasePage{

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    private WebElement doubleClickBtn;

    @FindBy(xpath = "//*[@id='rightClickBtn']")
    private WebElement rightClickBtn;

    @FindBy(xpath = "//button[starts-with(text(),'Click Me')]") //Boton dinamico
    private WebElement clickMeBtn;

    @FindBy(xpath = "//*[@id='doubleClickMessage']")
    private WebElement doubleClickMessage;

    @FindBy(xpath = "//*[@id='rightClickMessage']")
    private WebElement rightClickMessage;

    @FindBy(xpath = "//*[@id='dynamicClickMessage']")
    private WebElement dynamicClickMessage;

    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    public void doubleClickButton() throws InterruptedException {
        try {
            if(doubleClickBtn.isDisplayed()){
                Actions actions = new Actions(driver);
                actions.doubleClick(doubleClickBtn).perform();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaSiMensajeDobleClickEsValido(String arg0) throws InterruptedException{
        try {
            if(doubleClickMessage.isDisplayed()){
                String textoActual = doubleClickMessage.getText();
                String textoEsperado = "You have done a double click";

                if (textoActual.equals(textoEsperado)){
                    System.out.println("Mensaje doble click es el esperado");
                }else{
                    System.out.println("Mensaje doble click no es el esperado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void rightClickButton() throws InterruptedException{
        try {
            if(rightClickBtn.isDisplayed()){
                Actions actions = new Actions(driver);
                actions.contextClick(rightClickBtn).perform();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaSiMensajeRightClickEsValido(String arg0) throws InterruptedException{
        try {
            if(rightClickMessage.isDisplayed()){
                String textoActual = rightClickMessage.getText();
                String textoEsperado = "You have done a right click";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Mensaje right click es el esperado");
                    Thread.sleep(5000);
                }else {
                    System.out.println("Mensaje right click no es el esperado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickMeButton() throws InterruptedException{
        try {
            if(clickMeBtn.isDisplayed()){
                clickMeBtn.click();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaSiMensajeDynamicClickEsValido(String arg0) throws InterruptedException{
        try {
            if(dynamicClickMessage.isDisplayed()){
                String textoActual = dynamicClickMessage.getText();
                String textoEsperado = "You have done a dynamic click";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("Texto dinamico es el esperado");
                    Thread.sleep(5000);
                }else{
                    System.out.println("Texto dinamico no es el esperado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
