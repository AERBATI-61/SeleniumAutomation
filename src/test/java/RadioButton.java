import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButton = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        yesRadioButton.click();
        System.out.println("RadioButton is Enable?  "+ yesRadioButton.isEnabled());

        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement yesRadioButtonSelected = driver.findElement(By.id("yesRadio"));
        System.out.println("RadioButton is Selected?  "+yesRadioButtonSelected.isSelected());


        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println("RadioButton is Enable?  "+ noRadioButton.isEnabled());



    }
}
