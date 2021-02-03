package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    public WebDriver driver;

    @Given("^I go to Invoice Management URL\"([^\"]*)\"$")
    public void i_go_to_Invoice_Management_URL(String url) throws Throwable {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get(url);
    }

    @When("^I enter a valid username \"([^\"]*)\"$")
    public void i_enter_a_valid_username(String validUsername) throws Throwable {
        driver.findElement(By.id("inputEmail")).sendKeys(validUsername);
    }

    @When("^I enter valid password \"([^\"]*)\"$")
    public void i_enter_valid_password(String validPassword ) throws Throwable {
     driver.findElement(By.id("inputPassword")).sendKeys(validPassword);
    }

    @When("^I click the Login button$")
    public void i_click_the_Login_button() throws Throwable {
    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    @Then("^I should be logged in successfully with the message \"([^\"]*)\"$")
    public void i_should_be_logged_in_successfully_with_the_message(String loginMessage) throws Throwable {
    String actualMessage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/p")).getText();
        Assert.assertEquals(loginMessage,actualMessage);
    }

    @Then("^then click the back button to go to Invoice Management homepage\"([^\"]*)\"$")
    public void then_click_the_back_button_to_go_to_Invoice_Management_homepage(String url) throws Throwable {
        driver.navigate().back();

    }

}
