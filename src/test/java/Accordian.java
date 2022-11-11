import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Accordian {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/accordian");
        driver.manage().window().maximize();

        WebElement collapse = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));

        String className = collapse.getAttribute("class");
        System.out.println(className);

        driver.findElement(By.id("section1Heading")).click();

        className = collapse.getAttribute("class");
        System.out.println(className);

        try{
            sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        className = collapse.getAttribute("class");
        System.out.println(className);
    }
}
