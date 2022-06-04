package Tests;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Chart extends TestBase {
@Test
    public void chart(){
        driver.get("https://amazon.com.tr");
        WebElement chartButton= driver.findElement(By.id("nav-cart-count-container"));
        chartButton.click();

        String title= driver.getTitle();
        System.out.println(title);
    SoftAssert softAssert=new SoftAssert();
    System.out.println("yeni ekleme");

    softAssert.assertTrue(title.contains("Amazon.com.tr Alışveriş Sepeti"));



    }
}
