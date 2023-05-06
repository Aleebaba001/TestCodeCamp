import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumWebSignupTest {
    //import the selenium webdriver
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        //1. Open your chrome browser
        driver = new ChromeDriver();

        //2. Input your Selenium Demo page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");

        //Test 1: verify the user input the right url and is on the right webpage
        if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com"))
        //pass
        System.out.println("Correct Webpage");

        else
        //fail
        System.out.println("Wrong Webpage");

        Thread.sleep(5000);

        //3. Maximize the browser
        driver.manage().window().maximize();

        //4. Click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 0)
<<<<<<< HEAD
    public void positivesignup() throws InterruptedException {
        //Test 2: verify that the user can signup with valid details

        //5. locate the username field and enter a username
        driver.findElement(By.id("user_username")).sendKeys("aleebaba9000");
        //6. locate the email field and enter an email
        driver.findElement(By.id("user_email")).sendKeys("aleebaba9000@gmailinator.com");
        //7. locate the password field and enter a password
        driver.findElement(By.id("user_password")).sendKeys("admin9000");
        //8. click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
=======
    public void negativesignup() throws InterruptedException {
        //Test 2: verify that when user cannot signup with username less than 3 characters
            driver.findElement(By.id("user_username")).sendKeys("ali");
            driver.findElement(By.id("user_email")).sendKeys("aleebaba01@gmailinator.com");
            driver.findElement(By.id("user_password")).sendKeys("admin01");
            driver.findElement(By.id("submit")).click();
            Thread.sleep(5000);
>>>>>>> 9484b7bdf230fcf4d2935cceb0599ed18286233f
    }

    @Test (priority = 1)
    public void clickUser1Item() throws InterruptedException {
        //9. click on User1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //Test 3: verify that when user clicks on signip button, the user is directed to signup page
        String expectedurl = "https://selenium-blog.herokuapp.com";
        String actualurl = driver.getCurrentUrl();
                if(actualurl.contains(expectedurl))
                    //pass
                    System.out.println("Correct Webpage");

                else
                    //fail
                    System.out.println("Wrong Webpage");
        Thread.sleep(5000);
    }

    @Test (priority = 2)
            public void verifyItem() throws InterruptedException {
        //Test 9: Search for an item (using python with selenium) and confirm it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(5000);
        String expectedPageUrl = "https://selenium-blog.herokuapp.com/users/1";
        String actualPageUrl = driver.getTitle();
        if (actualPageUrl.contains(expectedPageUrl))
            //pass
            System.out.println("Correct User1page");

        else
            //fail
            System.out.println("Wrong User1page");
    }

    @Test (priority = 3)
    public void logoutsuccessfully() {
        //11. click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        //Test 10: verify that when a user logout, he/she is directed to the homepage
        String expectedTitle = "AlphaBlog";
        String actualTitle = driver.getTitle();
        if(expectedTitle.contains(actualTitle))
            //pass
            System.out.println("Correct User1page");

        else
            //fail
            System.out.println("Wrong User1page");


    }

    @Test (priority = 4)
    public void negativesignup() throws InterruptedException {
        //Test 2: verify that the user cannot signup with username less than 3 characters

        //Click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);

        //5. locate the username field and enter a username
        driver.findElement(By.id("user_username")).sendKeys("al");
        //6. locate the email field and enter an email
        driver.findElement(By.id("user_email")).sendKeys("aleebaba900@gmailinator.com");
        //7. locate the password field and enter a password
        driver.findElement(By.id("user_password")).sendKeys("admin900");
        //8. click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeBrowser() {
        //12. Close the browser
        driver.quit();
    }
}



/** Test Cases

 * 1. Verify that the user input the right URL and that he/she is on the right webpage
 * 2. Verify that when user clicks on the signup button, the user is directed to signup
 * 3. Verify that user cannot signup with username less than 3 characters
 * 4. Verify that user cannot signup with invalid email
 * 5. Verify that user cannot login with a password less than or equal to one character
 * 6. Verify that user cannot signup with either or all of the fields blank
 * 7. Verify that user is successfuly signed up when valid details are inputted
 * 8. Verify that User1 item is present on the item list page
 * 9. Verify that item searched for on the User1 page is present
 * 10. Verify that when the user logout, he/she is directed back to the homepage

 **/



//10. Search for an item (Using Python with Selenium) and confirm it is present

