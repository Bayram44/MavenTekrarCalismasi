package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day10_Tekrar03 {

    static WebDriver driver;
    @Before
    public void testtenÖnce(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.get("http://amazon.com");
        WebElement dropDown= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Baby");
        select.selectByValue("search-alias=automotive-intl-ship");
        select.selectByIndex(6);


        WebElement secimYazdir= select.getFirstSelectedOption();
        System.out.println(secimYazdir.getText());

        List<WebElement> list = select.getOptions();

        for (WebElement w: list) {
            System.out.println(w.getText());
        }

        int toplamSecenekSayisi=list.size();
        System.out.println("Toplam secenek sayisi "+toplamSecenekSayisi);
    }
}
