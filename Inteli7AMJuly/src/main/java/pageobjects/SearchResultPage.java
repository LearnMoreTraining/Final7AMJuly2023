package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SearchResultPage  extends BaseCode {

    public static void selectProductByIndex(int index){

        driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-"+index+"']")).click();
    }
}
