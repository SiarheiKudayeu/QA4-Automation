package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.ibuongiorno.com/about");
        //a[@href='/contacts']
        //img[@alt='Logo I Buongiorno']
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("//a[@href='/contacts']")).getLocation());
        System.out.println(driver.findElement(By.xpath("//img[@alt='Logo I Buongiorno']")).getLocation());

        Actions actions = new Actions(driver);
        for(int i = 0; i < 3; i++) {
            actions.moveToElement(driver.findElement(By.xpath("//a[@href='/contacts']")), 0, 60)
                    .clickAndHold()
                    .moveToElement(driver.findElement(By.xpath("//img[@alt='Logo I Buongiorno']")), 0, 60)
                    .release().build().perform();
        }
        System.out.println(driver.manage().window().getSize().height);
        System.out.println(driver.manage().window().getSize().width);
        driver.quit();

    }
}
