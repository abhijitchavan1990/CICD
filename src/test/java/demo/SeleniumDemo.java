package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumDemo {

    @Test
    public void startBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
       System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
        driver.quit();

    }
}
