package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public static void main(String args[]){
        BaseTests test = new BaseTests();
       // test.setUp();
        test.independenceExerciseSolution();
    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        // workaround to fix issue with Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Theare are " + links.size() + " links on a page.");

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        driver.quit();
    }

    public void independenceExerciseSolution(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        // workaround to fix issue with Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement example1Link = driver.findElement(By.partialLinkText("Menu Element"));
        example1Link.click();

       String pageHeader = driver.findElement(By.cssSelector("h3")).getText();
        List <WebElement> listItems = driver.findElements(By.tagName("li"));
        System.out.println("There are " + listItems.size() + " menu items on a " + pageHeader +" page.");


        driver.quit();
    }
}
