import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnable = sportCheckBox.isEnabled();
        System.out.println("isEnable: " + isEnable);

        WebElement sportChechBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if (isEnable){
            try{
                sportCheckBox.click();
            }
            catch (ElementClickInterceptedException e){
                sportChechBoxLabel.click();
            }
        }

        boolean isSelected = sportCheckBox.isSelected();
        System.out.println("isSelected: " + isSelected);
    }
}
