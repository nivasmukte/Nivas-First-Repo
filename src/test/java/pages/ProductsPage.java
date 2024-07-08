package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ProductsPage {
    public static String formalShoes_xpath="/html/body/div[2]/center/h2";

    public static String sportsShoes_xpath="/html/body/div[3]/center/h2";

    public static String sneakers_xpath="/html/body/div[4]/center/h2";

    public static String formalShoes_dropdown_xpath="/html/body/div[2]/center/div/i[1]";

    public static String sportsShoes_dropdown_xpath="/html/body/div[3]/center/div/i[1]";

    public static String sneakers_dropdown_xpath="/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_firstShoes_Name="/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportsShoes_firstShoes_Name="/html/body/div[3]/table/tbody/tr[1]/td[1]";

    public static String sneakers_firstShoes_Name="/html/body/div[4]/table/tbody/tr[1]/td[1]";


    public static void formalShoes_verifyTitle(){

        String formalShoes_title=driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(formalShoes_title,"Formal Shoes");
    }

    public static void sportsShoes_verifyTitle(){
        String sportsShoes_title=driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(sportsShoes_title,"Sports Shoes");
    }

    public static void sneakers_verifyTitle(){
        String sneakers_title=driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(sneakers_title,"Sneakers");

    }



    public static void formalShoes_firstshoes_Name_verifyTitle(){
        String expectedFormalShoesName="   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoes_dropdown_xpath)).click();
        String actualFormalShoesName=driver.findElement(By.xpath(formalShoes_firstShoes_Name)).getText();
        Assert.assertEquals(actualFormalShoesName,expectedFormalShoesName);

    }
    public static void sportsShoes_firstshoes_Name_verifyTitle(){
        String expectedSportsShoesName="   Ultimate";
        driver.findElement(By.xpath(sportsShoes_dropdown_xpath)).click();
        String actualSportsShoesName=driver.findElement(By.xpath(sportsShoes_firstShoes_Name)).getText();
        Assert.assertEquals(actualSportsShoesName,expectedSportsShoesName);

    }
    public static void sneakers_firstshoes_Name_verifyTitle(){

        String expectedSneakersShoesName="   Archivo";
        driver.findElement(By.xpath(sneakers_dropdown_xpath)).click();
        String actualSneakersShoesName=driver.findElement(By.xpath(sneakers_firstShoes_Name)).getText();
        Assert.assertEquals(actualSneakersShoesName,expectedSneakersShoesName);
    }
}
