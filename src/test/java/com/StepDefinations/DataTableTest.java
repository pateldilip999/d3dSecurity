package com.StepDefinations;

import com.driverClass;
import com.pages.DataTable_page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

import static junit.framework.TestCase.assertEquals;

public class DataTableTest extends driverClass {


//     public DataTable_page dataTable_page= PageFactory.initElements(driver,DataTable_page.class);




     @Then("^I click on register button$")
    public void iClickOnRegisterButton() {

        driver.findElement(By.linkText("Register")).click();
    }


    @Given("^I enter firstname as \"([^\"]*)\"$")

    public void iEnterFirstNameAs(String firstname) throws Throwable {
      driver.findElement(By.name("first_name")).sendKeys("");
    }

    @Given("^I enter lastname as \"([^\"]*)\"$")
    public void iEnterLastnameAs(String lastname) throws Throwable {
        driver.findElement(By.name("last_name")).sendKeys("");
    }

    @Given("^I enter email as \"([^\"]*)\"$")
   public void iEnterEmailAs(String email) throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/main/article/div/div/form/fieldset/div[3]/input")).sendKeys(email);
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        driver.findElement(By.cssSelector("div.cleanlogin-field:nth-child(5) > input:nth-child(1)")).sendKeys(password);
         }

    @Given("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String conpass) throws Throwable {
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/main/article/div/div/form/fieldset/div[6]/input")).sendKeys(conpass);
    }

    @When("^I click on registration button$")
    public void iClickOnRegistrationButton() {

 driver.findElement(By.name("btn-submit")).click();
    }

    @Then("^I should see my account button$")
    public void iShouldSeeMyAccountButton() {
        String actual_pagetitle;
        String expected_pagetitle = "My Account";
        actual_pagetitle=driver.findElement(By.cssSelector("/html/body/div[1]/div[1]/div[2]/div/main/article/h1")).getText();
        assertEquals(expected_pagetitle,actual_pagetitle);
        }

    @And("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String expected_url) throws Throwable {
        String actual_url;
        actual_url = driver.getCurrentUrl();
        assertEquals(expected_url,actual_url);
    }

    @And("^I should see login text$")
    public void iShouldSeeLoginText() {
String actual_login;
String expected_login = "Login";
actual_login=driver.findElement(By.cssSelector(".u-column1 > h2:nth-child(1)")).getText();
assertEquals(expected_login,actual_login);
    }

    @And("^I should see register text$")
    public void iShouldSeeRegisterText() {
        String actual_register;
        String Expected_register = "Register";
        actual_register=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/main/article/div/div/div/div[2]/h2")).getText();
        assertEquals(Expected_register,actual_register);
    }

    @And("^I should see username field$")
    public void iShouldSeeUsernameField() {
        String actual_username;
        String expected_username = "Username or email address *";
        actual_username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/main/article/div/div/div/div[1]/form/p[1]/label")).getText();
        assertEquals(expected_username,actual_username);
        }

    @And("^I should see password field$")
    public void iShouldSeePasswordField() {
    String actual_password;
    String expected_password = "Password *";
    actual_password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/main/article/div/div/div/div[1]/form/p[2]/label")).getText();
    assertEquals(expected_password,actual_password);
    }

    @Given("^I enter web as \"([^\"]*)\"$")
    public void iEnterWebAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
//
//    @Then("^I should see error message as\"([^\"]*)\"$")
//    public void iShouldSeeErrorMessageAs(String error)  {
//        driver.findElement(by.)
    }


//    @And("^I should see login button$")
//    public void iShouldSeeLoginButton() {
//    String actual_login;
//    String expected_login = "Login";
//    actual_login=driver.findElement(By.linkText(".woocommerce-form > p:nth-child(3) > input:nth-child(3)")).click();
//    assertEquals(expected_login,actual_login);
//    }
//}


