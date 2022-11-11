import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ToolTips {
    WebDriver driver;
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/tool-tips");
        driver.manage().window().maximize();

        WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));



        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipButton).perform();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

        WebElement tooltipInner = driver.findElement(By.className("tooltip-inner"));
        System.out.println(tooltipInner.getText());





    }
}
