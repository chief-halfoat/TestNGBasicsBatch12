package class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginTest {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test(groups = "regression")
    public void VerifyCredentials() {
        SoftAssert soft = new SoftAssert();
        String expectedText = "Invalid credentials";
        WebElement Username = this.driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys(new CharSequence[]{"123456"});
        this.driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"123456"});
        this.driver.findElement(By.id("btnLogin")).click();
        String text = this.driver.findElement(By.id("spanMessage")).getText();
        soft.assertEquals(text, expectedText);
        System.out.println("hello world");
        soft.assertTrue(displayed);
        soft.assertAll();
    }
    @Test(groups = "regression")
    public void VerifyCredentials2() {
        SoftAssert soft = new SoftAssert();
        String expectedText = "Invalid credentials";
        WebElement Username = this.driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys(new CharSequence[]{"123456"});
        this.driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{"123456"});
        this.driver.findElement(By.id("btnLogin")).click();
        String text = this.driver.findElement(By.id("spanMessage")).getText();
        soft.assertEquals(text, expectedText);
        System.out.println("hello world");
        soft.assertTrue(displayed);
        soft.assertAll();
    }

    @AfterMethod(alwaysRun = true)
    public void CloseBrowser() {
        this.driver.quit();
    }
}
