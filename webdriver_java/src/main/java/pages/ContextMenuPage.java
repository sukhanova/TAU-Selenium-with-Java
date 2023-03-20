package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){

        this.driver = driver;
    }

    public void rightClickInBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }

    public String getTextOnPopUp(){
        return driver.switchTo().alert().getText();
    }

    public void acceptPopup(){
        driver.switchTo().alert().accept();
    }


}
