import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import static java.lang.Thread.sleep;

public class AlertClass {

    //alertButton
    /*
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();

        try{
            sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
    }*/



    //timerAlertButton
    /*
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("timerAlertButton")).click();
        try{
            sleep(50000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
    }
    */



    //confirmButton
    /*
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        confirmButton.click();
        System.out.println(driver.switchTo().alert().getText());

        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.switchTo().alert().accept();

    }
    */







    //promtButton
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();



        WebElement confirmButton = driver.findElement(By.id("promtButton"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Arafat");


        try{
            sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        alert.accept();

    }



}
