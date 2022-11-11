import org.apache.http.client.HttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BrokenImage {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();



        WebElement imagBroken = driver.findElement(By.xpath("//div/img[1]"));
        String getImagUrl = imagBroken.getAttribute("src");


        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(getImagUrl);
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);

    }
}
