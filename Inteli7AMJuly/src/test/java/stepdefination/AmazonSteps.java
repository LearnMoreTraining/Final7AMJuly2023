package stepdefination;

import com.mongodb.connection.SslSettings;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.*;
import resuable.BaseCode;

import java.io.IOException;
import java.util.*;

public class AmazonSteps extends BaseCode{

  @When("user enters the {string} in search bar")
  public void enterSearchKeyword(String product){

  // driver.findElement(By.name("field-keywords")).sendKeys(product);

  //  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(product);

  //  driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(product);

    HomePage.enterProduct(product);
  }

  @And("user clicks on search icon")
  public void clickSearchIcon(){

   // driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

    HomePage.clickSearchIcon();
  }
  @Given("user navigates to {string}")
  public void login(String url) throws IOException {

 BaseCode.browserInvocation();

  }


    @Then("user validates the search result")
    public void verifySearchResult() {

  //  String value =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();

      String value =  driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).getText();
    if(value.contains("iphone")) {
     Assert.assertTrue(true);
    }
    else{
     Assert.assertTrue(false);
    }

   // driver.findElement(By.linkText("Forgot Your Password?")).click();
      driver.findElement(By.partialLinkText("ur Passwo")).click();
  }

  @Given("user search the product {string} and navigate to search result page")
  public void searchProduct(String product) throws IOException {

    HomePage.enterProduct(product);
    HomePage.clickSearchIcon();

  }

  @When("user sort by newest arrival")
  public void user_sort_by_newest_arrival() {

  }


  @Then("validate whether thr newest arrival is selected")
  public void validate_whether_thr_newest_arrival_is_selected() {

  }

  @Given("user navigates to signin page")
  public void navigateToLogin() throws IOException {

    HomePage.clickLoginButton();

  }

  @Then("validate whether the user navigate to signIn page")
  public void validateLoginpage() {

    Assert.assertEquals("Sign In",LoginPage.getLoginTitle());

  }

    @Given("user selects the value from the static dropdown")
    public void handleStaticDropdown() {

      WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
      Select currencyDropdown = new Select(currencyElement);
     // currencyDropdown.selectByIndex(3);
      // currencyDropdown.selectByVisibleText("OMR");
      currencyDropdown.selectByValue("SAR");

//    int currencySize =  currencyElement.findElements(By.tagName("option")).size();
//
//      List<String> currencyValue = new ArrayList<String>();
//      for(int i =0 ; i < currencySize;i++){
//
//       currencyValue.add( currencyElement.findElements(By.tagName("option")).get(i).getText());
//
//      }
//      System.out.println(currencyValue);

  List<WebElement> element = currencyElement.findElements(By.tagName("option"));

  List<String> val = new ArrayList<>();
  for(WebElement e:element){

      val.add(  e.getText());
  }

  //[SELECT, BDT, CAD, EUR, INR, KWD, MYR,SAR,OMR, SGD, GBP, AED, USD]
      boolean flag = false;
      int count =0 ;
      for(String s:val){

            if(s.equals("ABC")){
              count = count++;
              flag = true ;
                Assert.assertEquals("OMR",s);
            }
      }

      Assert.assertTrue(flag);
     // Assert.assertEquals(1,count);



      //0 < 13
      //1 < 13
      //2 < 13
      //12 < 13
      //13 < 13


    }

  @Given("user handles the mouse action")
  public void userHandlesTheMouseAction() {

    HomePage.howerSignIn();
    HomePage.clickBabyList();

  }


  @Then("validate whether the user navigate to Babywishlist page")
  public void validateWhetherTheUserNavigateToBabywishlistPage() {

    Assert.assertEquals("Amazon: Baby Wish List", BabyListPage.getBabyListTitle());

  }

  @Given("user drag and drop")
  public void userDragAndDrop() {

  WebElement dragDropFrame = driver.findElement(By.className("demo-frame"));

    driver.switchTo().frame(dragDropFrame);

    Actions actions = new Actions(driver);
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable"));
    actions.dragAndDrop(drag,drop).build().perform();

    driver.switchTo().defaultContent();

  }

  @Given("Hdfc link")
  public void hdfcLink() {

    driver.findElement(By.xpath("//div[@id='welcomesec1']//a[normalize-space(text())='Know More...']")).click();

      SearchResultPage.selectProductByIndex(5);
  }

    @Given("user iterates the column values")
    public void userIteratesTheColumnValues() {

      WebElement eyElement = driver.findElement(By.cssSelector(".infobox.vcard"));

      List <WebElement> columnOneElement =  eyElement.findElements(By.tagName("th"));

      List<String> columnOneValue = new ArrayList<>();

      for(WebElement e:columnOneElement){

          columnOneValue.add(e.getText());
      }


        System.out.println(columnOneValue);

      List <String> colValueTwo = new ArrayList<>();

      for (int i=1 ; i < eyElement.findElements(By.tagName("td")).size() ; i++) {

          colValueTwo.add(eyElement.findElements(By.tagName("td")).get(i).getText());

      }

      Map<List, List> m = new HashMap<List,List>();
      m.put(columnOneValue,colValueTwo);

      Assert.assertEquals("EY",m.get("Trade name"));




        System.out.println(colValueTwo);

    WebElement revenuTableElement = driver.findElement(By.className("wikitable")) ;

   List <WebElement> fy19Element = revenuTableElement.findElements(By.xpath("//tr//td[4]"));
   List<String> fy19Value = new ArrayList<>();

   for (WebElement h:fy19Element){

       fy19Value.add(h.getText());
   }

        System.out.println(fy19Value);

    }

    @Given("Handle hyperlink")
    public void handleHyperlink() {

      WebElement getToKnowElement = driver.findElement(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//div[@class='navFooterLinkCol navAccessibility'][1]"));
//      List<WebElement> e = getToKnowElement.findElements(By.xpath("//li/a"));
//      for(WebElement j:e){
//
//         String ac= Keys.chord(Keys.CONTROL,Keys.ENTER);
//          j.sendKeys(ac);
//      }

      for(int i =0 ; i < getToKnowElement.findElements(By.xpath("//li/a")).size();i++){

          String ac= Keys.chord(Keys.CONTROL,Keys.ENTER);
          getToKnowElement.findElements(By.xpath("//li/a")).get(i).sendKeys(ac);

      }

      SpiceJetHome.search();
      SpiceJetHome.applyWait();
      SpiceJetHome.clickNext();

    }

    @Given("Handle Calander")
    public void handleCalander() {

      driver.findElement(By.className("ui-datepicker-trigger")).click();


      while( !driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText().equals("December")){

          driver.findElement(By.xpath("//span[text()='Next']")).click();
      }


    Boolean en =  driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();
     Assert.assertFalse(en);

      //boolean - true  , false

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isSelected();

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected();

   String alertmessage = driver.switchTo().alert().getText();

   driver.switchTo().alert().sendKeys("12");
   driver.switchTo().alert().accept();

    }

    @Given("Handle the Window")
    public void handleTheWindow() {

      WebElement productSection = driver.findElement(By.xpath("//div[@id='nav_menu-2']"));

     int sizeOf = productSection.findElements(By.tagName("li")).size();

     for(int i = 0 ; i < sizeOf ; i++){
         String keyAction =Keys.chord(Keys.CONTROL,Keys.ENTER);
         productSection.findElements(By.tagName("a")).get(i).sendKeys(keyAction);
        }


    Set<String> handleValues = driver.getWindowHandles();

     for(String j:handleValues){

         if(driver.switchTo().window(j).getTitle().equals("BrowserStack Test Observability")) {
             System.out.println("Window is switched");
             break;
         }
         }

     driver.switchTo().defaultContent();
     }

    }
