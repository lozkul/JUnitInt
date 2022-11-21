package day05_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Before_After {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void amazontest(){


        driver.get("https://wwww.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void facebooktest(){


        driver.get("https://wwww.facebook.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void bestbuytest(){


        driver.get("https://wwww.bestbuy.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void teardown(){
        driver.close();
    }



}