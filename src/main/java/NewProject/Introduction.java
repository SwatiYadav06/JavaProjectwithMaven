package NewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Introduction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SWATI\\New notes\\Java Programs\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");   // Navigate to URL

        System.out.println("Title: " + driver.getTitle());  // Print page title

        driver.close();
    }
}
