package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {

  public static WebDriver driver ;
  public static Properties prob ;

    public static WebDriver browserInvocation() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/configutaion/config.properties"));

        prob = new Properties();
        prob.load(fis);


       if( prob.getProperty("browser").equalsIgnoreCase("edge")){
           driver = new EdgeDriver();
           EdgeOptions e = new EdgeOptions();

       }
       else if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
           driver = new ChromeDriver();
           ChromeOptions c = new ChromeOptions();
           c.setAcceptInsecureCerts(true);
           c.addArguments("--disbale-notifications");
       }
       else if(prob.getProperty("browser").equalsIgnoreCase("safari")){
           driver = new SafariDriver();
       }
       else{
          throw new InvalidArgumentException("Enter the crorrect browser details");
       }

       driver.navigate().to( prob.getProperty("url"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        return driver;
    }

}
