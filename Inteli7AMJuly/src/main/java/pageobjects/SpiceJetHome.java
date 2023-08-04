package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;

import java.time.Duration;

public class SpiceJetHome extends BaseCode {


    public static void selectFromDropdownValue(String city){

        driver.findElement(By.xpath("//a[text()='"+city+"']")).click();

        // //a[text()=' Agra (AGR)']

    }

    public static void selectToDropdownValue(String city){

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[text()='"+city+"']")).click();

        // //div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[text()=' Agra (AGR)']

    }

    public static void search(){

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();

    }

    public static  void applyWait() {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
        w.pollingEvery(Duration.ofSeconds(5));
        w.ignoring(NoSuchElementException.class);
        w.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")));
        //8s  --> addition time of 12S


    }

    public static void clickNext(){
        driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")).click();

    }


    public static void ex(){

        try {
            driver.findElement(By.id("Button1")).click();
        }
        catch (NoSuchElementException i){
            driver.findElement(By.id("Button2")).click();
        }
        catch (ElementClickInterceptedException y){

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        }


    }




}
