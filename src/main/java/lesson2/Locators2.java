package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // xpath    //tag_name[@attribut_name = 'value']
        /*driver.get("https://www.guinnessworldrecords.com/records/");
        Thread.sleep(4000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@title = 'Login or Register']")).click();*/

/*        driver.get("https://www.guinnessworldrecords.com/records/");
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath( "//i[@class = 'icon icon-search']")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//input[@id = 'search-term']"));
        element.sendKeys("Whaaaaat");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id = 'search-button']")).click();*/

        //xpath text
       /* driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath
                ("//a[text() = 'Standard application']")).getText());

        System.out.println(driver.findElement(By.xpath
                ("//a[contains(text(), 'o an account')]")).getText());
        driver.quit();*/

   /*     driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        System.out.println(
                driver.findElement(By.xpath
                        ("//div[contains(@class, 'block-4-12')][not(contains(@class, 'columned'))]"))
                        .getText()
        );
        driver.quit();*/

/*        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        System.out.println(
                driver.findElement(By.xpath
                                ("//section[contains(@class, 'wo')]//a[@class = 'btn']"))
                        .getText()
        );
        driver.quit();*/

        /*
        /.. вверх по дереву
        /tag_name вниз к указанному тегу
        /parent::tag_name переход на родительский тег
        /child::tag_name переход на дочерний тег
        //following-sibling::tag_name перход на параллельный тег
         */

/*        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='APPLY']/../following-sibling::div[3]")).click();*/

    }
}
