import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import utils.Waiters;

public class Homework5 {
    public static void main(String[] args) throws InterruptedException {
        //tspan
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(6000);
        Waiters waiters = new Waiters(driver);
        waiters.waitForVisabilityOfWebElement(driver.findElement(By.tagName("circle")));
        System.out.println(driver.findElements(By.tagName("circle")).size());
        /*WebElement elementStart = driver.findElements(By.tagName("circle")).get(2);
        WebElement elementFinish = driver.findElements(By.tagName("circle")).get(0);*/
        WebElement elementStart = driver.findElement(By.cssSelector("circle[r='40']"));
        WebElement elementFinish = driver.findElement(By.cssSelector("circle[r='8']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementStart).clickAndHold().moveToElement(elementFinish, 0, 30)
                .release().build().perform();

    }
}
