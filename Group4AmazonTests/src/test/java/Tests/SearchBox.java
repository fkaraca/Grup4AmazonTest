package Tests;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchBox extends TestBase {
    @Test
    public void SearchBox(){
        driver.get("http://amazon.com");
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Computers");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("mouse");
        searchBox.submit();
        WebElement mouseResult=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("mouseResult = " + mouseResult.getText());

    }
}
