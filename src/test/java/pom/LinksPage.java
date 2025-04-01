package pom;

import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;

public class LinksPage extends BasePage{

    @FindBy(xpath = "//a[@id='simpleLink']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[@id='dynamicLink']")
    private WebElement homeLinkDynamic;

    @FindBy(xpath = "//a[@id='created']")
    private WebElement createdLinkApi;

    @FindBy(xpath = "//*[@id='linkResponse' and contains(text(), 'Link')]")
    private WebElement linkResponseMessage;

    public LinksPage(WebDriver driver) {
        super(driver);
    }

    public void newTabLink() throws InterruptedException{
        try {
            if(homeLink.isDisplayed()){
                homeLink.click();
                Thread.sleep(3500);
            }

            //Cerrar pestaña y volver a la primera
            Set<String> ventanas = driver.getWindowHandles();
            String primeraPestana = driver.getWindowHandle();

            for(String ventana : ventanas){
                if(!ventana.equals(primeraPestana)){
                    driver.switchTo().window(ventana);
                    driver.close();
                }
            }

            driver.switchTo().window(primeraPestana);

            Thread.sleep(3500);

        } catch (Exception e) {
            throw e;
        }
    }

    public void newTabDynamicLink() throws InterruptedException{
        try {
            if(homeLinkDynamic.isDisplayed()){
                homeLinkDynamic.click();
                System.out.println("se pulsa dinamic link");
                Thread.sleep(3500);
            }

            //Cerrar pestaña y volver a la primera
            Set<String> ventanas = driver.getWindowHandles();
            String primeraPestana = driver.getWindowHandle();

            for(String ventana : ventanas){
                if(!ventana.equals(primeraPestana)){
                    driver.switchTo().window(ventana);
                    driver.close();
                }
            }
            driver.switchTo().window(primeraPestana);
            Thread.sleep(3500);
        } catch (Exception e) {
            throw e;
        }
    }

    public void clickCreatedLink() throws InterruptedException{
        try {
            if(createdLinkApi.isDisplayed()){
                createdLinkApi.click();
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validaSiCreatedLinkSePulso(String arg0) throws InterruptedException{
        try {
            if(linkResponseMessage.isDisplayed()){
                String textoActual = linkResponseMessage.getText();
                System.out.println(textoActual);
                String textoEsperado = "Link has responded with staus 201 and status text Created";
                if(textoActual.equals(textoEsperado)){
                    System.out.println("Texto es el esperado del link created");
                }else{
                    System.out.println("Texto no es el esperado del link created");
                }
            }
        }catch (Exception e){
            throw e;
        }
    }




}
