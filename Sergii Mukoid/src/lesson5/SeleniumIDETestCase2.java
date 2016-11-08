package lesson5;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIDETestCase2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "C://Users//SERG//Downloads//TestAutomationLessons//geckodriver.exe");
	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  capabilities.setCapability("marionette", true);
	  driver = new MarionetteDriver(capabilities); 
    baseUrl = "https://www.google.com.ua/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSeleniumIDETestCase2() throws Exception {
    driver.get(baseUrl + "/search?q=mortage+calculator&ie=utf-8&oe=utf-8&gws_rd=cr&ei=shQhWMCYO8aysQHHxrbACA");
    driver.findElement(By.linkText("Mortgage Calculator")).click();
    driver.findElement(By.name("param[homevalue]")).clear();
    driver.findElement(By.name("param[homevalue]")).sendKeys("687");
    driver.findElement(By.id("loanamt")).clear();
    driver.findElement(By.id("loanamt")).sendKeys("250078");
    driver.findElement(By.id("intrstsrate")).clear();
    driver.findElement(By.id("intrstsrate")).sendKeys("15");
    driver.findElement(By.id("loanterm")).clear();
    driver.findElement(By.id("loanterm")).sendKeys("7");
    new Select(driver.findElement(By.name("param[start_month]"))).selectByVisibleText("Jan");
    new Select(driver.findElement(By.name("param[start_year]"))).selectByVisibleText("2017");
    driver.findElement(By.id("hoi")).clear();
    driver.findElement(By.id("hoi")).sendKeys("100050");
    driver.findElement(By.name("cal")).click();
    assertEquals("$60.11", driver.findElement(By.xpath("//div[4]/div[2]/h3")).getText());
  }

  @After
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
