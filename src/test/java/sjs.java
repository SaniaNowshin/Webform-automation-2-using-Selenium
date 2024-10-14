import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import java.util.List;
import java.util.regex.Pattern;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class sjs {

    private WebDriver driver;

    @BeforeAll
    public void setUp() {
        // Set the path for ChromeDriver
        driver = new ChromeDriver();

        // Maximize browser window and set an implicit wait time
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the registration page
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
    }

    @Test
    public void seGuestRegistration() throws InterruptedException {

        //First name, last name, email
        driver.findElement(By.id("first_name")).sendKeys("Sania");
        driver.findElement(By.id("last_name")).sendKeys("Nowshin");
        driver.findElement(By.id("user_email")).sendKeys("sania4@test.com");

        //user password
        driver.findElement(By.id("user_pass")).sendKeys("SaniaHello!@#56");

        Thread.sleep(5000);
        driver.findElement(By.className("mailcheck-suggestion")).click();


    }

}
