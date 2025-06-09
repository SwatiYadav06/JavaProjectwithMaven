package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Logintest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SWATI\\New notes\\Java Programs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");   // Navigate to URL
        driver.findElement(By.id("login-username")).sendKeys("Swati");
        driver.findElement(By.id("login-password")).sendKeys("1234");
        driver.findElement(By.id("js-login-btn")).click();
        System.out.println("Title: " + driver.getTitle());  // Print page title
// login page
        driver.close();
    }
}
