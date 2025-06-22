package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SWATI\\New notes\\Java Programs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("username")).sendKeys("Swati");
        driver.findElement(By.name("password")).sendKeys("swati@123");
        driver.findElement(By.className("orangehrm-login-button")).click();
        System.out.println("Title: " + driver.getTitle());
       // System.out.println(driver.findElement(By.className("oxd-alert-content-text")).getText());

        driver.findElement(By.className("orangehrm-login-forgot-header")).click();
         driver.close();

    }
}
