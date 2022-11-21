package day13_excel_screenshot_jsExecuter;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class C05_ScreenShot extends TestBase {

    @Test
    public void test01() throws IOException {

        // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //Tum sayfanın fotosunu çek
        tumSayfaResimCek();


        // Nutella icin arama yapalim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        webelementScreenshot(aramaKutusu);

        aramaKutusu.submit();


        // sonuclarin Nutella icerdigini test edelim

        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedkelime="Nutella";
        String actualYazi= sonucYaziElementi.getText();

        Assert.assertTrue(actualYazi.contains(expectedkelime));

        webelementScreenshot(sonucYaziElementi);



    }


}
