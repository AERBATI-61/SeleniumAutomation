import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class Slider {
    WebDriver driver;
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 20, 0).perform();


        WebElement rangeValue = driver.findElement(By.className("range-slider__tooltip__label"));
        String rangeValueText = rangeValue.getText();
        System.out.println("rangeValue: " + rangeValueText);

        WebElement sliderValue = driver.findElement(By.id("sliderValue"));
        String sliderValueText = sliderValue.getAttribute("value");
        System.out.println("sliderValue: " + sliderValueText);


        Assertions.assertEquals(rangeValueText, sliderValueText, "Values are not Edual.");
    }
}
