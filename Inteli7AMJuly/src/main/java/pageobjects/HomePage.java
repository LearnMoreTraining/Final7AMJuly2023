package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import resuable.BaseCode;

public class HomePage extends BaseCode {

   private static Select select;
   private static By helloSignInSection = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    public static void enterProduct(String productName){

       driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);

    }

    public static void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    public static void clickLoginButton(){

        driver.findElement(helloSignInSection).click();
    }

    public static void selectDropdownByIndex(int index){

        initilizeStaticDropdown();
        select.selectByIndex(index);
    }

    public static void selectDropdownByValue(String value){

        initilizeStaticDropdown();
        select.selectByValue(value);

    }

    public static void selectDropdownByText(String value){

        initilizeStaticDropdown();
        select.selectByVisibleText(value);

    }

    public static void initilizeStaticDropdown(){

        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
        select = new Select(selectElement);
    }

    public static void howerSignIn(){
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(helloSignInSection)).build().perform();

    }

    public static void clickBabyList(){

        driver.findElement(By.linkText("Baby Wishlist")).click();
    }



}
