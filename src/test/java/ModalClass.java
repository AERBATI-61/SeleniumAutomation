import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalClass {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();

        WebElement showSmallModal = driver.findElement(By.id("showSmallModal"));
        showSmallModal.click();


        WebElement modalBody = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(modalBody.getText());

        WebElement closeSmallModal = driver.findElement(By.id("closeSmallModal"));
        closeSmallModal.click();

    }
}
