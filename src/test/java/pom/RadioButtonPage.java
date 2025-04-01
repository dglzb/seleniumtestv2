package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {

    @FindBy(xpath = "//div[@class='mb-3' and contains(text(), 'Do')]")
    private WebElement tituloRadioButtonSection;

    @FindBy(xpath = "//label[@for='yesRadio']")
    private WebElement yesRadioButton;

    @FindBy(xpath = "//label[@for='impressiveRadio']")
    private WebElement impresiveRadioButton;

    @FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div[2]/p")
    private WebElement resultYes;

    @FindBy(xpath = "//*[@id='app']/div/div/div/div[2]/div[2]/p")
    private WebElement resultImpresive;

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public void visualizarTituloRadioButton(String arg0) throws InterruptedException{
        try {
            if(tituloRadioButtonSection.isDisplayed()){
                String texto = tituloRadioButtonSection.getText();
                if(texto.equals(arg0)){
                    System.out.println("Texto radioButton validado");
                }else{
                    System.out.println("Texto radiobutton no validado");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void clickOnYesRadioButton() throws InterruptedException{
        try {
            if(yesRadioButton.isDisplayed()){
                yesRadioButton.click();
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void validaResultYesRadioButton(String arg0) throws InterruptedException{
        try {
            if(resultYes.isDisplayed()){
                String textoActual = resultYes.getText();
                String textoEsperado = "You have selected Yes";
                Thread.sleep(4000);

                if(textoActual.equals(textoEsperado)){
                    System.out.println("RadioButtonYes es igual");
                }else{
                    System.out.println("RadioButtonYes no es igual");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickOnImpresiveRadioButton() throws InterruptedException{
        try {
            if(impresiveRadioButton.isDisplayed()){
                impresiveRadioButton.click();
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void validaResultImpresiveRadioButton(String arg0) throws InterruptedException{
        try {
            if(resultImpresive.isDisplayed()){
                String textoActual = resultImpresive.getText();
                String textoEsperado = "You have selected Impressive";

                if(textoActual.equals(textoEsperado)){
                    System.out.println("RadioButton Impressive es igual");
                }else{
                    System.out.println("RadioButton Impressive no es igual");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }


}
