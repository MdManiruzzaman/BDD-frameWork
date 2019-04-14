package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {
    WebDriver driver;

    @Given("^user in the register page$")
    public void user_in_the_register_page(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manir\\Desktop\\PIIT\\SeleniumDownloads29Dec\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
    }

    @Then("^put first name$")
    public void put_first_name() throws Throwable {
        driver.findElement(By.id("firstname")).sendKeys("Manir");

    }

    @Then("^put last name$")
    public void put_last_name() throws Throwable {
        driver.findElement(By.id("lastname")).sendKeys("Zaman");

    }

    @Then("^provide email address$")
    public void provide_email_address() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("1234abc@gmail.com");

    }

    @Then("^give password$")
    public void give_password() throws Throwable {
        driver.findElement(By.id("PASSWORD")).sendKeys("abcd1234");

    }

    @Then("^click create account button$")
    public void click_create_account_button() throws Throwable {
        Thread.sleep(30000);
        driver.quit();
        }

}
