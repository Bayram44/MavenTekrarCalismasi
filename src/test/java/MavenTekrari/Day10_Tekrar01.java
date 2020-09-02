package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_Tekrar01 {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        // google.com'a git.
        driver.get("http://google.com");
        // Eger WebEelenet görunuyorsa true
        // eger WebElement görunmuyorsa false
        WebElement logo= driver.findElement(By.id("hplogo"));

        // testimizin sonucunu JUnit'e bildiriyoruz logo görunuyorsa basarili görunmuyorsa basarisiz sonuc aliriz.
        Assert.assertTrue( logo.isDisplayed()?true:false);
        System.out.println("Logo görunuyor");
    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

}
