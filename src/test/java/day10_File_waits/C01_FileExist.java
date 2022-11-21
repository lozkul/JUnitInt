package day10_File_waits;

import org.junit.Test;

import javax.activation.FileDataSource;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExist {

    @Test
    public void test01(){

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
//"C:\Users\HP\Dropbox\My PC (DESKTOP-UDF9J2T)\Desktop\FileTesti\deneme.txt"    masaüstündeki fileın yolu



        // masa üstünde file testi klasörü ve onun altındaki deneme dosyası için
        String dosyaYolu = System.getProperty("user.home")+"\\Dropbox\\My PC (DESKTOP-UDF9J2T)\\Desktop\\FileTesti\\deneme.txt";
        System.out.println(dosyaYolu);
        System.out.println(Files.exists(Paths.get(dosyaYolu)));


    }


}
