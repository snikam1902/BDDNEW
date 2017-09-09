import cucumber.api.java.en.Given;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shweta on 02/07/2017.
 */
public class StepDefinations {
    WebDriver driver;
    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/Browser/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser()
    {
        driver.quit();
    }



    @Given("^Admin is on home page$")
    public void admin_is_on_home_page() {
        Assert.assertTrue(driver.findElement(By.className("ico-login")).isDisplayed());
    }

    @When("^customer click on login link$")
    public void customer_click_on_login_link() {
        driver.findElement(By.className("ico-login")).click();
    }

    @Then("^customer  navigate to login page$")
    public void customer_navigate_to_login_page() {

        Assert.assertTrue(driver.findElement(By.cssSelector(".button-1.login-button")).isDisplayed());
    }




}
