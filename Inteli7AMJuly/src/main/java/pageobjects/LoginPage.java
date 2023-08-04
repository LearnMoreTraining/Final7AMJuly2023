package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;
import resuable.ExcelHandling;

import java.io.IOException;

public class LoginPage extends BaseCode {


    public static void enterMailId() throws IOException {

      //  driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prob.getProperty("mailid"));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(ExcelHandling.readExcel("credi",0,0));
    }

    public static void enterPassword() throws IOException {

       // driver.findElement(By.id("ap_password")).sendKeys(prob.getProperty("password"));
        driver.findElement(By.id("ap_password")).sendKeys(ExcelHandling.readExcel("credi",1,0));


    }

    public static void clickContinueButton(){
        driver.findElement(By.id("continue")).click();
    }

    public static void clickSignInButton(){
        driver.findElement(By.id("signInSubmit")).click();
    }

    public static String getLoginTitle(){
       String title =driver.getTitle();
       return title;
    }


}
