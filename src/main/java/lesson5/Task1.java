package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://zoo.kyiv.ua/");
        WebElement element = driver.findElement(By.xpath("//label[text()='ВАРТІСТЬ КВИТКІВ']"));
        int centreX = element.getLocation().x + (element.getSize().width)/2;
        int centreY = element.getLocation().y + (element.getSize().height)/2;
        System.out.println("Coordination of centre x "+ centreX);
        System.out.println("Coordination of centre y "+ centreY);
        driver.quit();
    }
}
