package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.guinnessworldrecords.com/search");
        Thread.sleep(2000);

        driver.findElement(By.id("search-term")).sendKeys("Something");


        driver.findElement(By.id("search-button")).click();

        driver.quit();
    }
}
