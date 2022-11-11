import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frame1 {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();


        driver.switchTo().frame("frame1"); //driver.switchTo().frame(1);
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);


        driver.switchTo().parentFrame();
        List<WebElement> elementList = driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraph = elementList.get(0).getText();
        System.out.println(paragraph);



    }
}
