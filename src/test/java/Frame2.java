import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frame2 {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();


        /*
        WebElement iframe1 = driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(iframe1);
        */

        /*
        WebElement closeButton = driver.findElement(By.id("cbb"));
        closeButton.click();
        */



        driver.switchTo().frame("frame1");
        WebElement parentBody = driver.findElement(By.tagName("body"));
        System.out.println(parentBody.getText());

        driver.switchTo().frame(0);
        WebElement childBody = driver.findElement(By.tagName("p"));
        System.out.println(childBody.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();


    }
}
