package lesson2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //id
        /*driver.get("https://guinnessworldrecords.com/records/");
        WebElement element = driver.findElement(By.id("globe"));
        element.click();*/

/*        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Hello Siarhei");
        driver.quit();*/

        /*//name
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.name("q")).sendKeys("хомяк");

        //class name
            Thread.sleep(4000);


        driver.findElement(By.xpath("//*[@class = 'icon icon--search']")).click();

        //tagName
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.tagName("h1"));
        String elementText = element.getText();
        System.out.println(elementText);*/

/*        driver.get("https://www.guinnessworldrecords.com/search");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        inputs.get(1).sendKeys("Most handstand push ups");
        driver.findElement(By.id("search-button")).click();*/

        //linkText
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(4000);
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.linkText("APPLICATION PROCESS")).click();
        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("DS SHOWCA")).click();
        driver.quit();

    }
}
