package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBy_xpath {
    public static void main(String[] args) {
        // XPath----------------
        System.setProperty("webdriver.chrome.driver","D:\\SWATI\\New notes\\Java Programs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Swati");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@id='js-login-btn']")).click();
        System.out.println("Title: " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//button[@id='js-notification-box-msg']")).getText());
        driver.close();
    }
}
