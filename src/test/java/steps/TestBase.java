package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected CheckBoxPage checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
    protected RadioButtonPage radioButtonPage = PageFactory.initElements(driver, RadioButtonPage.class);
    protected WebTablesPage webTablesPage = PageFactory.initElements(driver, WebTablesPage.class);
    protected ButtonPage buttonPage = PageFactory.initElements(driver, ButtonPage.class);
    protected LinksPage linksPage = PageFactory.initElements(driver, LinksPage.class);
    protected UploadDownloadPage uploadDownloadPage = PageFactory.initElements(driver, UploadDownloadPage.class);
    protected PracticeFormPage practiceFormPage = PageFactory.initElements(driver, PracticeFormPage.class);




}
