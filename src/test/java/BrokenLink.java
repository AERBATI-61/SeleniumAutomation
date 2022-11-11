import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BrokenLink {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        /*
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://demoqa.com/");
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        */



        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
    }
}
