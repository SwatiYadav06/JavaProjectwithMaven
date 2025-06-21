package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SWATI\\New notes\\Java Programs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("login-username")).sendKeys("Swati");
        driver.findElement(By.id("login-password")).sendKeys("1234");
        driver.findElement(By.id("js-login-btn")).click();
        System.out.println("Title: " + driver.getTitle());
        System.out.println(driver.findElement(By.id("js-notification-box-msg")).getText());

        driver.findElement(By.className("btn--primary")).click();
         driver.close();

    }
}
