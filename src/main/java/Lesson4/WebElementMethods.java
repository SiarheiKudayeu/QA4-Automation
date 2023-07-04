package Lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {
    static void clearTextAndSendKeys(WebElement element, String text) {
        element.clear();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.sendKeys(text);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://guinnessworldrecords.com/search");
        driver.manage().window().maximize();

        //sendKeys
       /* WebElement searchField = driver.findElement(By.id("search-term"));
        searchField.sendKeys("Search");
        searchField.sendKeys(Keys.ENTER);
        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement searchAfterRefresh = driver.findElement(By.id("search-term"));
        searchAfterRefresh.sendKeys("Search2");
        searchAfterRefresh.sendKeys(Keys.ENTER);*/

/*        WebElement searchField = driver.findElement(By.id("search-term"));
        searchField.sendKeys("Searcher");
        //searchField.sendKeys(Keys.CONTROL);
        Thread.sleep(2000);
        searchField.clear();
        Thread.sleep(2000);*/

// get from Element
/*        WebElement searchButton = driver.findElement(By.id("search-button"));
        System.out.println(searchButton.getText());
        System.out.println(searchButton.getTagName());
        System.out.println(searchButton.getAttribute("class"));
        System.out.println(searchButton.getCssValue("background"));


        System.out.println(searchButton.getLocation());
        System.out.println(searchButton.getLocation().x);
        System.out.println(searchButton.getLocation().y);

        System.out.println(searchButton.getSize());
        System.out.println(searchButton.getSize().width);
        System.out.println(searchButton.getSize().height);

        int x_centerOfElement = searchButton.getLocation().x + (searchButton.getSize().width) / 2;
        int y_centerOfElement = searchButton.getLocation().y + (searchButton.getSize().height) / 2;
        System.out.println("(" + x_centerOfElement + ", " + y_centerOfElement + ")");*/

        //RememberMe
        driver.get("https://guinnessworldrecords.com/Account/Login");
        Thread.sleep(4000);
        //driver.findElement(By.id("ez-accept-all")).click();
        WebElement checkbox = driver.findElement(By.id("RememberMe"));
        System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        System.out.println("===================");
        Thread.sleep(4000);
        checkbox.click();
        System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.isEnabled());
        System.out.println(checkbox.isSelected());
        Thread.sleep(4000);
        WebElement username = driver.findElement(By.id("Username"));
        username.sendKeys("text");
        Thread.sleep(1000);
        clearTextAndSendKeys(username, "New text");
        Thread.sleep(4000);
        driver.quit();

    }
}
