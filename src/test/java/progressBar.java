import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class progressBar {

    WebDriver driver;
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");
        driver.manage().window().maximize();

        WebElement startStopButton = driver.findElement(By.id("startStopButton"));
        startStopButton.click();



    }


}
