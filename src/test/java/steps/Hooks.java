package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

   public static ChromeDriver driver;
   public static ChromeOptions options;

   @Before
    public void setUp(){
       System.setProperty("webdriver.chrome.driver","/Users/vn53tjl/Documents/ProjectsAutomation/seleniumtestv2/src/test/resources/drivers/chromedriver");
       options = new ChromeOptions();
       options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
       options.addArguments("--guest"); //-> Para que no aparezca ventana o pop-up para guardar contraseña y usuario
       driver = new ChromeDriver(options);
       driver.get("https://demoqa.com/");
       driver.manage().window().maximize();
   }

   @After
   public void tearDown(){
       driver.close();
   }

    public static ChromeDriver getDriver(){
        return driver;
    }

}
