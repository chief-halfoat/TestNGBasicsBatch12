package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    public static WebDriver driver;
//    to login into syntax HRMS application with incorrect credentials
    @Test
    public void invalidCredentials1() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(text,"Invalid credentials");
    }

    @BeforeMethod
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @AfterMethod
    public void CloseBrowser() {
        driver.quit();
    }
    @Test
    public void verifyCredentials(){
        String expectedText = "Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("123456");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(text,expectedText);
        boolean displayed = username.isDisplayed();

        Assert.assertTrue(displayed);

    }
}
