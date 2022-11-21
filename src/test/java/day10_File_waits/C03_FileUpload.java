package day10_File_waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_FileUpload extends TestBase {

/*
1.Tests packagenin altina bir class oluşturun : C05_UploadFile
2.https://the-internet.herokuapp.com/upload adresine gidelim
3.chooseFile butonuna basalim
4.Yuklemek istediginiz dosyayi secelim.
5.Upload butonuna basalim.
6.“File Uploaded!” textinin goruntulendigini test edelim.
 */

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSecButonu = driver.findElement(By.id("file-upload"));
        String yuklenecekDosyaYolu = "C:\\Users\\HP\\Dropbox\\My PC (DESKTOP-UDF9J2T)\\Desktop\\FileTesti\\deneme.txt";
        dosyaSecButonu.sendKeys(yuklenecekDosyaYolu);
        bekle(5);

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploadYaziElementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadYaziElementi.isDisplayed());



    }





}
