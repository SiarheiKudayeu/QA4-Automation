package lesson5.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://www.signesduquotidien.org/");
        //driver.findElement(By.cssSelector(".menu-icon.dots-icon"));
        //driver.findElement(By.id("option2"));
        //driver.findElement(By.id("menu-btn"));
        Thread.sleep(2000);
        driver.findElement(By.id("menu-btn")).click();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.id("option2"))).clickAndHold()
                .moveToElement(driver.findElement(By.id("menu-btn"))).release()
                .build().perform();

        driver.navigate().to("https://www.signesduquotidien.org/");
        Thread.sleep(2000);
        driver.findElement(By.id("menu-btn")).click();
        Thread.sleep(2000);
        WebElement resource = driver.findElement(By.id("option2"));
        WebElement target = driver.findElement(By.id("menu-btn"));
        actions.dragAndDrop(resource, target).perform();

    }
}
