package MavenTekrari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_Tekrar01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung headphones");
        searchBox.submit();

        WebElement result= driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(result.getText());


        WebElement ilkUrun= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(ilkUrun.getText());

        List<WebElement> list= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for(WebElement w:list){
            System.out.println(w.getText());
        }

    }
}
