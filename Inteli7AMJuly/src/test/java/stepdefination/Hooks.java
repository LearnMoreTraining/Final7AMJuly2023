package stepdefination;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode{

    @Before() //before start of each scenario
    public void setup() throws IOException {
        System.out.println("---Browser Started----");
        BaseCode.browserInvocation();
    }

    @After()  //after executing all the test steps in the scenario
    public void tearDown(){

        driver.close();
    }

    @AfterStep()
    public void takeScreenshot(Scenario sc){
       byte[] screenshot = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(screenshot,"image/png",sc.getName());
    }

}
