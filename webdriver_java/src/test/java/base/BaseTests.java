package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.SecureAreaPage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected SecureAreaPage secureAreaPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        // workaround to fix issue with Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        goHome();
        homePage = new HomePage(driver);

        secureAreaPage = new SecureAreaPage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//        // test.independenceExerciseSolution();
//    }
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
