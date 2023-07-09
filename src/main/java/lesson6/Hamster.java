package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Hamster {
    static String clickAndReturnHandle(WebElement element, WebDriver driver) {
        Set<String> set1 = driver.getWindowHandles();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).keyDown(Keys.COMMAND).click().keyUp(Keys.COMMAND).build().perform();
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        return set2.iterator().next();
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/");
        driver.findElement(By.name("q")).sendKeys("Хорек");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        String newHandle = clickAndReturnHandle(driver.findElement(By.xpath("//a[@href = '/oplata-i-dostavka/']")), driver);
        //driver.findElement(By.cssSelector(".icon--search")).click();
        System.out.println(newHandle);
        driver.switchTo().window(newHandle);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
