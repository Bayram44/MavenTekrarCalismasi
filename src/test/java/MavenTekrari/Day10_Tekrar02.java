package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_Tekrar02 {

    static WebDriver driver;
    @Before
    public void testtenÖnce(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://bestbuy.com");
    }
    @Test
    public void otsiskkoTest(){
        String otsikko= driver.getTitle();
        Assert.assertTrue(otsikko.contains("Best")?true:false);
        System.out.println("Baslik Best kelimesini iceriyor.");
    }

    @Test
    public void logoTest(){
        WebElement logo= driver.findElement(By.xpath("//img[@class='logo']"));
        Assert.assertTrue(logo.isDisplayed()?true:false);
        System.out.println("Logo var.");
    }

    @Test
    public void mexicoLinkTest(){
        WebElement mexicoLink= driver.findElement(By.xpath("//img[@alt='Mexico']"));
        Assert.assertTrue(mexicoLink.isDisplayed()?true:false);
        System.out.println("Mexico linki gözukuyor.");
    }
    @After
    public void testtenSonra(){
        driver.quit();
    }
}
