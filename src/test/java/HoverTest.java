import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class HoverTest {

    @Test
    public void ActionTest() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        // kliknięcie PPM
        Actions actions = new Actions(driver);
        //actions.contextClick().perform();
        //actions.contextClick(driver.findElement(By.id("myFile"))).perform();

        WebElement heading = driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading);

        


    }
}
