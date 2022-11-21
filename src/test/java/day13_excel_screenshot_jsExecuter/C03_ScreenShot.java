package day13_excel_screenshot_jsExecuter;

import org.junit.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenShot extends TestBase {


    @Test
    public void test01() throws IOException {
        driver.get("https://wwww.amazon.com");
        tumSayfaResimCek();
        driver.get("https://www.youtube.com");
        tumSayfaResimCek();
        bekle(1);

    }
}
