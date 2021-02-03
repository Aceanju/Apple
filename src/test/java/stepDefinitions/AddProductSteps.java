package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddProductSteps {
    WebDriver driver;

    @Given("^Im on the Invoice Management homepage$")
    public void im_on_the_Invoice_Management_homepage() throws Throwable {
    }


    @When("^I click on Products$")
    public void i_click_on_Products() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[3]/a")).click();
       }

    @When("^click on Add Product button$")
    public void click_on_Add_Product_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"products_add\"]")).click();
    }


    @When("^I enter the Name\"([^\"]*)\"$")
    public void i_enter_the_Name(String name) throws Throwable {
        driver.findElement(By.name("name")).sendKeys(name);

    }

    @When("^I enter the details\"([^\"]*)\"$")
    public void i_enter_the_details(String details) throws Throwable {
        driver.findElement(By.id("details")).sendKeys(details);

    }

    @When("^I enter the price\"([^\"]*)\"$")
    public void i_enter_the_price(String price) throws Throwable {
        driver.findElement(By.name("price")).sendKeys(price);

    }

    @When("^I click on Add Product$")
    public void i_click_on_Add_Product() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/form/div[4]/div/input")).click();

    }

    @Then("^The product is added successfully and I get a message\"([^\"]*)\"$")
    public void the_product_is_added_successfully_and_I_get_a_message(String addSuccessMessage) throws Throwable {
        String actualMessage = driver.findElement(By.xpath("/html/body/div[3]/div[2]")).getText();
        Assert.assertEquals(actualMessage,addSuccessMessage);}



    }


