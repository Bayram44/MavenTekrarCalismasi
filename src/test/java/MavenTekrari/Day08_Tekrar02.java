package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Tekrar02 {

    @BeforeClass
    public static void setUp(){
        System.out.println("Setup calisti");

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");

    }
    @Test
    public void test1(){
        System.out.println("test1 calsiti");
    }
    @Test
    public void test2(){
        System.out.println("test2 calsiti");
    }
}