package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Tekrar05 {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Before
    public void testtenÖnce(){
        driver.get("http://google.com");
    }


    @Test
    public void test1(){
        WebElement hakuLaatikko= driver.findElement(By.name("q"));
        hakuLaatikko.sendKeys("elma");
        hakuLaatikko.submit();
    }

    @Test
    public void test2(){
        WebElement hakuLaatikko= driver.findElement(By.name("q"));
        hakuLaatikko.sendKeys("samsung kulaklik");
        hakuLaatikko.submit();
    }
    @Test
    public void test3(){
        WebElement hakuLaatikko= driver.findElement(By.name("q"));
        hakuLaatikko.sendKeys("calisma sandalyesi");
        hakuLaatikko.submit();
    }

    @After
    public void testtenSonra(){
        WebElement result= driver.findElement(By.id("result-stats"));
        System.out.println(result.getText());
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
