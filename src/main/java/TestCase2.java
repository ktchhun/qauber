package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://testwave.qabidder.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCase2() throws Exception {
    driver.get(baseUrl + "/#/page/login");
    driver.findElement(By.id("exampleInputEmail1")).clear();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("kokautomation@mailinator.com");
    driver.findElement(By.id("exampleInputPassword1")).clear();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//li[4]/a/span")).click();
    driver.findElement(By.linkText("Next→")).click();
    driver.findElement(By.name("caseNumber")).clear();
    driver.findElement(By.name("caseNumber")).sendKeys("123");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("last");
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("first");
    driver.findElement(By.name("middleName")).clear();
    driver.findElement(By.name("middleName")).sendKeys("middle");
    driver.findElement(By.name("Nickname")).clear();
    driver.findElement(By.name("Nickname")).sendKeys("nick");
    driver.findElement(By.name("Age")).clear();
    driver.findElement(By.name("Age")).sendKeys("42");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("Height")).clear();
    driver.findElement(By.name("Height")).sendKeys("9.99");
    driver.findElement(By.name("Weight")).clear();
    driver.findElement(By.name("Weight")).sendKeys("123.4");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("primary-language")).clear();
    driver.findElement(By.name("primary-language")).sendKeys("Engrish");
    driver.findElement(By.name("street-address")).clear();
    driver.findElement(By.name("street-address")).sendKeys("123");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Oak");
    driver.findElement(By.cssSelector("input[name=\"state\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"state\"]")).sendKeys("Ca");
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("123456");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("1234567890");
    driver.findElement(By.cssSelector("div.col-md-3 > div.radio.c-radio > label > span.fa.fa-circle")).click();
    driver.findElement(By.xpath("//div[3]/ul/li[2]/a")).click();
    driver.findElement(By.cssSelector("span.fa.fa-check")).click();
    driver.findElement(By.name("Tattoos")).clear();
    driver.findElement(By.name("Tattoos")).sendKeys("sdfsd");
    driver.findElement(By.xpath("//div[2]/div/div/span/label/span")).click();
    driver.findElement(By.name("Scars")).clear();
    driver.findElement(By.name("Scars")).sendKeys("sdfsdf");
    driver.findElement(By.xpath("//div[3]/div/div/span/label/span")).click();
    driver.findElement(By.name("needleMarks")).clear();
    driver.findElement(By.name("needleMarks")).sendKeys("sdfsdf");
    driver.findElement(By.xpath("//div[4]/div/div/span/label/span")).click();
    driver.findElement(By.name("Tracks")).clear();
    driver.findElement(By.name("Tracks")).sendKeys("dfsdf");
    driver.findElement(By.xpath("//div[2]/div/div/div/span/label/span")).click();
    driver.findElement(By.name("Glasses")).clear();
    driver.findElement(By.name("Glasses")).sendKeys("sdfsdf");
    driver.findElement(By.xpath("//div[2]/div[2]/div/div/span/label/span")).click();
    driver.findElement(By.name("Mustache")).clear();
    driver.findElement(By.name("Mustache")).sendKeys("dsfsdf");
    driver.findElement(By.xpath("//div[2]/div[3]/div/div/span/label/span")).click();
    driver.findElement(By.name("Beard")).clear();
    driver.findElement(By.name("Beard")).sendKeys("sdfsdf");
    driver.findElement(By.xpath("//div[4]/ul/li[2]/a")).click();
    driver.findElement(By.name("socialSecurity")).clear();
    driver.findElement(By.name("socialSecurity")).sendKeys("123-12-1234");
    driver.findElement(By.name("driverLicense")).clear();
    driver.findElement(By.name("driverLicense")).sendKeys("sdffkj");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("other-id")).clear();
    driver.findElement(By.name("other-id")).sendKeys("sldkjflksdjf");
    new Select(driver.findElement(By.name("otherIdCountry"))).selectByVisibleText("United Kingdom");
    driver.findElement(By.name("otherIdState")).clear();
    driver.findElement(By.name("otherIdState")).sendKeys("help");
    driver.findElement(By.name("other-id-type")).clear();
    driver.findElement(By.name("other-id-type")).sendKeys("sdlkjflkj");
    driver.findElement(By.name("school-name")).clear();
    driver.findElement(By.name("school-name")).sendKeys("skdjfklsj");
    driver.findElement(By.name("school-address")).clear();
    driver.findElement(By.name("school-address")).sendKeys("sdfsaf");
    driver.findElement(By.name("school-city")).clear();
    driver.findElement(By.name("school-city")).sendKeys("scity");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("school-zip")).clear();
    driver.findElement(By.name("school-zip")).sendKeys("123123");
    driver.findElement(By.name("schoolTelephone")).clear();
    driver.findElement(By.name("schoolTelephone")).sendKeys("1231231231");
    driver.findElement(By.name("parent-name")).clear();
    driver.findElement(By.name("parent-name")).sendKeys("pname");
    driver.findElement(By.name("parent-address")).clear();
    driver.findElement(By.name("parent-address")).sendKeys("sfasdf");
    driver.findElement(By.name("parent-city")).clear();
    driver.findElement(By.name("parent-city")).sendKeys("pcity");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("parentZip")).clear();
    driver.findElement(By.name("parentZip")).sendKeys("12312");
    driver.findElement(By.name("parentTelephone")).clear();
    driver.findElement(By.name("parentTelephone")).sendKeys("1231231233");
    driver.findElement(By.name("occupation")).clear();
    driver.findElement(By.name("occupation")).sendKeys("employee");
    driver.findElement(By.name("employer-name")).clear();
    driver.findElement(By.name("employer-name")).sendKeys("asdf");
    driver.findElement(By.name("employer-address")).clear();
    driver.findElement(By.name("employer-address")).sendKeys("asdf");
    driver.findElement(By.name("employer-city")).clear();
    driver.findElement(By.name("employer-city")).sendKeys("ecity");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("employer-zip")).clear();
    driver.findElement(By.name("employer-zip")).sendKeys("12312");
    driver.findElement(By.name("employerTelephone")).clear();
    driver.findElement(By.name("employerTelephone")).sendKeys("1231231235");
    driver.findElement(By.xpath("//div[5]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//div[6]/fieldset/div/div/div/label/span")).click();
    driver.findElement(By.xpath("//div[6]/fieldset/div/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("//div[6]/fieldset/div/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("//div[4]/div/label/span")).click();
    driver.findElement(By.xpath("//div[5]/div/label/span")).click();
    driver.findElement(By.xpath("//fieldset/div[2]/div/div/span/label/span")).click();
    driver.findElement(By.name("otherDistribution")).clear();
    driver.findElement(By.name("otherDistribution")).sendKeys("sdfsad");
    driver.findElement(By.name("reasonForStop")).clear();
    driver.findElement(By.name("reasonForStop")).sendKeys("asdfsaf");
    driver.findElement(By.name("locationOfStop")).clear();
    driver.findElement(By.name("locationOfStop")).sendKeys("sadfsa");
    driver.findElement(By.name("dispositionOfStop")).clear();
    driver.findElement(By.name("dispositionOfStop")).sendKeys("sadfsaf");
    driver.findElement(By.name("gang-name")).clear();
    driver.findElement(By.name("gang-name")).sendKeys("sadfasf");
    driver.findElement(By.name("howLong")).clear();
    driver.findElement(By.name("howLong")).sendKeys("sdfsaf");
    driver.findElement(By.xpath("//div[3]/div/div/label/span")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("//div[3]/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("//div[4]/div/div/label/span")).click();
    driver.findElement(By.xpath("//div[4]/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("//div[5]/div/div/label/span")).click();
    driver.findElement(By.xpath("//div[5]/div[2]/div/label/span")).click();
    driver.findElement(By.xpath("//div[5]/div[3]/div/label/span")).click();
    driver.findElement(By.xpath("//fieldset[4]/div/div/div/label/span")).click();
    driver.findElement(By.name("paroleOfficer")).clear();
    driver.findElement(By.name("paroleOfficer")).sendKeys("sadfsafd");
    driver.findElement(By.name("paroleOfficerPhone")).clear();
    driver.findElement(By.name("paroleOfficerPhone")).sendKeys("sdfsfd");
    driver.findElement(By.xpath("//fieldset[4]/div[2]/div/div/label/span")).click();
    driver.findElement(By.name("probation-officer")).clear();
    driver.findElement(By.name("probation-officer")).sendKeys("sdfsaf");
    driver.findElement(By.name("probationOfficerPhone")).clear();
    driver.findElement(By.name("probationOfficerPhone")).sendKeys("sdfasfd");
    driver.findElement(By.name("other-information")).clear();
    driver.findElement(By.name("other-information")).sendKeys("sadfasf");
    driver.findElement(By.name("officerID")).click();
    driver.findElement(By.name("beat")).clear();
    driver.findElement(By.name("beat")).sendKeys("sdfasf");
    driver.findElement(By.xpath("//div[6]/ul/li[2]/a")).click();
    driver.findElement(By.name("vehicleLicense")).clear();
    driver.findElement(By.name("vehicleLicense")).sendKeys("kj34rds");
    driver.findElement(By.name("vehicleMake")).clear();
    driver.findElement(By.name("vehicleMake")).sendKeys("dfsg");
    driver.findElement(By.name("vehicleModel")).clear();
    driver.findElement(By.name("vehicleModel")).sendKeys("dgfs");
    driver.findElement(By.name("vehicleBodystyle")).clear();
    driver.findElement(By.name("vehicleBodystyle")).sendKeys("dfbdb");
    driver.findElement(By.name("vehicleYear")).clear();
    driver.findElement(By.name("vehicleYear")).sendKeys("1995");
    driver.findElement(By.name("vehicleColor")).clear();
    driver.findElement(By.name("vehicleColor")).sendKeys("dsfv");
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("vehicleOddities")).clear();
    driver.findElement(By.name("vehicleOddities")).sendKeys("sdlkjf");
    driver.findElement(By.xpath("//div[7]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//div[8]/ul/li[2]/a")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.cssSelector("li.ng-scope.active > a.ng-scope > span.ng-binding")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("first");
    driver.findElement(By.xpath("//div[2]/button")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
