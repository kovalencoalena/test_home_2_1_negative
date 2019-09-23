package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class test_2_negative_steps {
            public  static WebDriver driver;

            @Given("Open homepage")
            public void open_homepage() {
                System.setProperty("webdriver.chrome.driver","C://Automation_course/chromedriver_win32/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("http://automationpractice.com/index.php");

            }

            @Given("User navigate login page")
            public void user_navigate_login_page() {
                driver.findElement(By.linkText("Sign in")).click();

            }

            @When("Click on Sign in button")
            public void click_on_Sign_in_button() throws PendingException {
                driver.findElement(By.id("SubmitLogin")).click();// Write code here that turns the phrase above into concrete actions
                throw new cucumber.api.PendingException();
            }

            @Then("Validation message")
            public void validation_message() {
                Assert.assertEquals("There is 1 error\n" +
                        "\n" +
                        "1.An email address required.", driver.getTitle());//Write code here that turns the phrase above into concrete actions
                throw new PendingException();
            }

            @When("User fills incorrect login and correct password")
            public void user_fills_incorrect_login_and_correct_password() {
                WebElement email = driver.findElement(By.id("email"));
                WebElement password = driver.findElement(By.id("passwd"));
                email.sendKeys("blog.cucumberdd@gmail.com");
                password.sendKeys("Cucumber@blog");
                driver.findElement(By.id("SubmitLogin")).click();
                // Write code here that turns the phrase above into concrete actions
                throw new cucumber.api.PendingException();
            }

            @When("User fills correct login snd incorrect password")
            public void user_fills_correct_login_snd_incorrect_password() {
                WebElement email = driver.findElement(By.id("email"));
                WebElement password = driver.findElement(By.id("passwd"));
                email.sendKeys("blog.cucumberdd@gmail.com");
                password.sendKeys("Cucumber@blog222");
                driver.findElement(By.id("SubmitLogin")).click();// Write code here that turns the phrase above into concrete actions
                throw new cucumber.api.PendingException();
            }

        }
