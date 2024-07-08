package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class SeleniumTest {
    public static WebDriver driver;
    static ExtentReports reports;
    static ExtentTest test;
    static ExtentReports extent = new ExtentReports();
    @BeforeSuite
    public static void setUp() throws InterruptedException {
        driver =new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        ExtentSparkReporter spark =new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);

        HomePage.click_hamburgerMenu();
        HomePage.click_onlineProduct_link();

    }
    @Test
    public static void validateTitles_OnilneProducts() throws InterruptedException {

        test= extent.createTest("Validate Shoe title on online product page","verify all the shoe types title are present on online product page");
        ProductsPage.formalShoes_verifyTitle();
        ProductsPage.sportsShoes_verifyTitle();
        ProductsPage.sneakers_verifyTitle();

    }
    @Test
    public static void validateFirstFormalShoes(){
        test= extent.createTest("Validate formal Shoe title on online product page","verify formal the shoe types title are present on online product page");
        ProductsPage.formalShoes_firstshoes_Name_verifyTitle();
    }

    @Test
    public static void validateFirstSportsShoes(){

        ProductsPage.sportsShoes_firstshoes_Name_verifyTitle();
    }
    @Test
    public static void validateFirstSneakersShoes(){

        ProductsPage.sneakers_firstshoes_Name_verifyTitle();
    }
    @AfterSuite
    public static void cleanUp(){
        extent.flush();
    }
}
