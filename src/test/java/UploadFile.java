import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement uploadFile = driver.findElement(By.id("uploadFile"));
        uploadFile.sendKeys("C:\\Users\\lenovo\\OneDrive\\Resimler\\Saved Pictures\\Study\\01 (19).jpg");
    }
}
