package com.StepDefinations;

import cucumber.api.java.ca.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankStep {

    WebDriver driver;


    @Given("^I enter url as\"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {

        System.out.println(url);

        ChromeDriverManager.getInstance().setup();

       driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.get(url);
    }


    @Given("^I enter user-id as \"([^\"]*)\"$")
    public void iEnterUserIdAs(String userid) throws Throwable {

    driver.findElement(By.name("uid")).sendKeys(userid);

    }

    @Given("^I enter password as\"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {

      driver.findElement(By.name("password")).sendKeys(password);
      }

    @When("^I click login button$")
    public void iClickLoginButton() {

        driver.findElement(By.name("btnLogin")).click();
    }
    @When("^I Click on new customer button$")
    public void iClickOnNewCustomerButton() {

        driver.findElement(By.cssSelector("body > div:nth-child(4) > div > ul > li:nth-child(2) > a")).click();
        }

    @Given("^enter Customer Name as\"([^\"]*)\"$")
    public void enterCustomerNameAs(String custname) throws Throwable {

        driver.findElement(By.name("name")).sendKeys(custname);
    }

    @When("^I click on radio button$")
    public void iClickOnRadioButton() {

        driver.findElement(By.name("rad1")).click();

    }

    @Given("^I enter Date of Birth\"([^\"]*)\"$")
    public void iEnterDateOfBirth(String date) throws Throwable {

        driver.findElement(By.id("dob")).clear();
        driver.findElement(By.id("dob")).sendKeys(date);
    }

    @And("^I enter Address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String address) throws Throwable {

        driver.findElement(By.name("addr")).sendKeys(address);
    }

    @And("^I enter City as \"([^\"]*)\"$")
    public void iEnterCityAs(String city) throws Throwable {

        driver.findElement(By.name("city")).sendKeys(city);
    }


    @And("^I enter State as \"([^\"]*)\"$")
    public void iEnterStateAs(String state) throws Throwable {

        driver.findElement(By.name("state")).sendKeys(state);
    }

    @And("^I enter Pin as \"([^\"]*)\"$")
    public void iEnterPinAs(String pin) throws Throwable {

        driver.findElement(By.name("pinno")).sendKeys(pin);
    }


    @And("^I enter Telephone number as \"([^\"]*)\"$")
    public void iEnterTelephoneNumberAs(String telno) throws Throwable {
       
        driver.findElement(By.name("telephoneno")).sendKeys(telno);
    }

    @And("^I enter E-mail as \"([^\"]*)\"$")
    public void iEnterEMailAs(String email) throws Throwable {
        
        driver.findElement(By.name("emailid")).sendKeys(email);
    }


    @And("^I click submit button$")
    public void iClickSubmitButton() {
        driver.findElement(By.name("sub")).click();
    }

    public static class BracknellStep {



    }
}

