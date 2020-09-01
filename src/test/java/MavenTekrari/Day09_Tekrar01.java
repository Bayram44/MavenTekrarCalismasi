package MavenTekrari;

import com.sun.xml.internal.ws.resources.UtilMessages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Tekrar01 {

    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        //Google'in basligi "Google Arama Sayfasi"na esitmi?
        String otsikko= driver.getTitle();
        Assert.assertEquals("Google Arama Sayfasi",otsikko);
    }

    @Test
    public void test2(){
        driver.get("http://amazon.com");
        //Amazon'un basligi Amazon kelimesini iceriyor mu?

        String otsikko= driver.getTitle();
        Assert.assertTrue(otsikko.contains("Amazon")?true:false);
    }
    @Test
    public void test3(){
        driver.get("http://facebook.com");
        String otsikko= driver.getTitle();
        // facebook basligi Youtube icermesin
        Assert.assertFalse(otsikko.contains("Youtube")?true:false);

    }
    @Test
    public void test4(){
        driver.get("http://google.com");
        //Google'in basligi "Google Arama Sayfasi"na esitmi?

        String otsikko= driver.getTitle();
        System.out.println("Merhabalar");
        Assert.assertEquals("Google Arama Sayfasi",otsikko);
        //eger test basarisiz ise testin icinde kalan kismi calistirmiyor.
        System.out.println("Test dogrulama islemi bitti");

    }
    @Test
    public void test5(){
        driver.get("http://facebook.com");
        String otsikko= driver.getTitle();
        // facebook basligi Youtube icermesin
        Assert.assertFalse(otsikko.contains("Youtube")?true:false);
        System.out.println("Test dogrulama islemi bitti");


    }


    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
}
