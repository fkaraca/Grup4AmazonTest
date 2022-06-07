package Tests;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Chart extends TestBase {
@Test
    public void chart(){

        driver.get("https://amazon.com");

        WebElement find= driver.findElement(By.id("twotabsearchtextbox"));
        find.sendKeys("toys"+ Keys.ENTER);

        WebElement urun= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]"));
        urun.click();
        WebElement AddChart=driver.findElement(By.id("submit.add-to-cart"));
        AddChart.click();
        WebElement chartButton= driver.findElement(By.id("nav-cart-count-container"));
        chartButton.click();

        String title= driver.getTitle();
        System.out.println(title);
        SoftAssert softAssert=new SoftAssert();

         softAssert.assertTrue(title.contains("Amazon.com.tr Alışveriş Sepeti"));
         System.out.println("github uzerinde calisiyorum");
         System.out.println(" Calismaya devam");

         WebElement ChartProducts= driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
    System.out.println("Sepetinizde "+ChartProducts.getText()+" adet urun bulunmaktadir");


    }
}
