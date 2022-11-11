import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindTextElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement nameElement = driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("Arafat Emin");



        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("arafatemin@gmail.com");



        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Turkiye");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("istanbul", "Turkiye");


        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();


        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String nametext =  nameText.getText();
        System.out.println(nametext);

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String emailtext =  emailText.getText();
        System.out.println(emailtext);


        WebElement currentAddressText = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String currentaddresstext =  currentAddressText.getText();
        System.out.println(currentaddresstext);


        WebElement permanentAddressText = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String permanentaddresstext =  permanentAddressText.getText();
        System.out.println(permanentaddresstext);




    }
}
