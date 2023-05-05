import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumWebSignupTest {
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 0)
    public void negativesignup() throws InterruptedException {
            driver.findElement(By.id("user_username")).sendKeys("aleebaba11");
            driver.findElement(By.id("user_email")).sendKeys("aleebaba11@gmailinator.com");
            driver.findElement(By.id("user_password")).sendKeys("admin11");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(5000);
    }

    @Test (priority = 1)
    public void clickUser1Item() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 2)
            public void verifyItem() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}



//locate where the chromedriver is
//1. Open your chrome browser
//2. Input your Selenium Demo page URL (https://selenium-blog.herokuapp.com)
//3. Maximize the browser
//4. Click on the signup button to open the signup page
//5. Input your username in the username field
//6. Input your email address in the email address field
//7. Input your password in the password field
//8. Click on the signup button
//9. Click on User1 item on the list page
//10. Search for an item (Using Python with Selenium) and confirm it is present
//11. Click on logout
//12. Close the browser