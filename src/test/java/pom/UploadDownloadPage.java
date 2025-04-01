package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadDownloadPage extends BasePage{

    @FindBy(xpath = "//input[@id='uploadFile']")
    private WebElement uploadFileButton;

    @FindBy(xpath = "//a[@id='downloadButton']")
    private WebElement downloadButton;

    public UploadDownloadPage(WebDriver driver) {
        super(driver);
    }

    public void uploadFileFunction() throws InterruptedException{
        try {
            if(uploadFileButton.isDisplayed()){
                  String filePath = "/Users/vn53tjl/Documents/ProjectsAutomation/seleniumtestv2/src/test/resources/Files/dummy copy.pdf";
                  uploadFileButton.sendKeys(filePath);
                  Thread.sleep(5000);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void downloadButton() throws InterruptedException{
        try {
            if(downloadButton.isDisplayed()){
                downloadButton.click();
                Thread.sleep(5000);
            }

        } catch (Exception e) {
            throw e;
        }
    }
}
