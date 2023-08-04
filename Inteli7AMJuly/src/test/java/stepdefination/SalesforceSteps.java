package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.LoginPage;
import pageobjects.SpiceJetHome;
import resuable.BaseCode;

import java.io.IOException;

public class SalesforceSteps extends BaseCode {

    @Given("user navigates to sales force application")
    public void naviagtesToSalesforce() throws IOException {
        BaseCode.browserInvocation();
    }

    @When("user enter the user name {string} and password {string}")
    public void userEnterTheUserNameAndPassword(String userName, String password) {

        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.name("pw")).sendKeys(password);
    }

    @And("user clicks on login button")
    public void userEnterTheUserNameAndPassword() {
        driver.findElement(By.id("Login")).click();
    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {
      String actualError =  driver.findElement(By.id("error")).getText();
      String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";


        Assert.assertEquals(expectedError,actualError);
//      if(actualError.equals(expectedError)){
//          System.out.println("Pass");
//      }
//      else{
//          System.out.println("fail");
//      }
    }

    @Then("user navigates to the home page of the application")
    public void userNavigatesToTheHomePageOfTheApplication() {
    }

    @When("user enters the username and password")
    public void enterCredit() throws IOException {

        LoginPage.enterMailId();
        LoginPage.clickContinueButton();
        LoginPage.enterPassword();
        LoginPage.clickSignInButton();

    }

    @Given("user handles the dynmaic dropdown")
    public void dynamicDropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='CJB']")).click();

//        WebElement toDrop = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//        toDrop.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();

        SpiceJetHome.selectFromDropdownValue(" Agra (AGR)");

    }
}
