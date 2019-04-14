package pageObjects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {

 // @FindBy(how = How.XPATH, using = "//input[@id='gh-ac']")
    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchBox;
    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement searchButton;
    @FindBy(how = How.CSS, using = "#w3-w0 > li:nth-child(1) > ul > li > ul > li:nth-child(2) > span"
    public static WebElement verifyPage;

/*
            @Test
            public void contactAsWebMaster(){
            driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
            Select dropHeading = new Select(driver.findElement(By.id("id_contact")));
            dropHeading.selectByVisibleText("Webmaster");
            driver.findElement(By.id("email")).sendKeys("automation@test.com");
            driver.findElement(By.name("id_order")).sendKeys("F015362E");
            driver.findElement(By.name("message")).sendKeys("Contact us testing as Web Master");
            WebElement upload = driver.findElement(By.id("fileUpload"));
            upload.sendKeys("/Users/maruf/Desktop/UploadTest.png");

            driver.findElement(By.xpath("//*[@id=\'submitMessage\']/span")).click();
            String actualText = driver.findElement(By.xpath("//*[@id=\'center_column\']/p")).getText();
            Assert.assertEquals(actualText,"Your message has been successfully sent to our team.");
            System.out.println("Test passed as Web master");
            }
*/
    //  @FindBy(css = "#gh-ac")
  //  public static WebElement searchBox1;
    public void clickOnSearchBox(){
        WaitUntilClickAble(searchBox);
        searchBox.click();
    }
        public void i_am_in_Home_Page(){
        System.out.println("I am in Home Page");
    }
    public void enterProductName(String product){
        System.out.println("Home page title: "+driver.getTitle());
        searchBox.sendKeys(product, Keys.ENTER);
    }
    public void clickSearchButton(){
        searchButton.click();

    }
}
