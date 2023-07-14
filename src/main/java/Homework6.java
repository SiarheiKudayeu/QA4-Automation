import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import utils.Waiters;

import java.awt.*;
import java.util.Set;

public class Homework6 {
    public static void main(String[] args) throws InterruptedException {
//https://klopotenko.com/en/
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://klopotenko.com/en/");
        try {
            new Waiters(driver).waitForVisabilityOfWebElementReturn
                    (By.xpath("//a[@aria-label ='dismiss cookie message']")).click();
        } catch (Exception e){
            System.out.println("Cookies not Found");
        }

        //скрол страницы
/*        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");*/

        //ukr menu-item-5047882
        //rec menu-item-5047883
        //chef menu-item-5047924
        Actions actions = new Actions(driver);
        String window1Handle = driver.getWindowHandle();
        Set<String> window1 = driver.getWindowHandles();

        actions.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//ul[@id = 'menu-main_menu-en-1']//a[text()='Ukrainian']"))).keyUp(Keys.COMMAND)
                .build().perform();
        Set<String> window2 = driver.getWindowHandles();
        window2.removeAll(window1);
        String window2Handle = window2.iterator().next();

        Set<String> window3 = driver.getWindowHandles();

        actions.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//ul[@id = 'menu-main_menu-en-1']//a[text()='Recipes']"))).keyUp(Keys.COMMAND)
                .build().perform();
        Set<String> window4 = driver.getWindowHandles();
        window4.removeAll(window3);
        String window3Handle = window4.iterator().next();

        driver.switchTo().window(window2Handle);
        Thread.sleep(5000);
        driver.switchTo().window(window3Handle);
        Thread.sleep(5000);
        driver.switchTo().window(window1Handle);
        Thread.sleep(5000);
    }
}
