package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BasePage {

   protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void enmarcarObjeto(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;

            for(int i = 0; i < 3; i++) {
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", new Object[]{element, "border: 5px solid red;"});
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.getMessage();
        }
    }

    public static void desenmarcarObjeto(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;

            for(int i = 0; i < 3; i++) {
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", new Object[]{element, ""});
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.getMessage();
        }
    }

    public void takeScreenshot(){
        try {
            String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotPath = "target/screenshots/"+methodName+"-"+timestamp+".png";


            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.createDirectories(Paths.get("target/screenshots"));
            Files.copy(screenshot.toPath(), Paths.get(screenshotPath));

            System.out.println("Screenshot guardado en: " + screenshotPath);

        }catch (IOException e){
            e.printStackTrace();
        }

    }





   /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    public static void navigateTo(String url){
        driver.navigate().to("https://demoqa.com/");
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }*/


}
