import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static java.lang.Thread.sleep;

public class DatePicker {
    WebDriver driver;
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");


        selectDate("2000", "January", "11");




    }

    private void selectDate(String year, String month, String day){
        WebElement datePickerMonthYearInput = driver.findElement(By.id("datePickerMonthYearInput"));
        datePickerMonthYearInput.click();


        WebElement month_select = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(month_select);
        select.selectByVisibleText(month);

        WebElement year_select = driver.findElement(By.className("react-datepicker__year-select"));
        select = new Select(year_select);
        select.selectByVisibleText(year);


        List<WebElement> dayElements = driver.findElements(By.cssSelector("div.react-datepicker__day"));
        for (WebElement dayElement : dayElements) {
            System.out.println(dayElement.getText());
            String text = dayElement.getText();
            if (text.equals(day)) ;
            {
                dayElement.click();
                break;
            }
        }


        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
