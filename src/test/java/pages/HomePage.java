package pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String hamburgerMenu_xpath="//*[@id=\"menuToggle\"]/input";
    public static String onlineProduct_link_xpath="//*[@id=\"menu\"]/a[3]/li";

    public static void click_hamburgerMenu(){

        driver.findElement(By.xpath(hamburgerMenu_xpath)).click();
    }
    public static void click_onlineProduct_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineProduct_link_xpath)).click();
    }
}
