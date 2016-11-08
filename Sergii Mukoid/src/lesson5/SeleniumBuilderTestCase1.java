package lesson5;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class SeleniumBuilderTestCase1 {
    MarionetteDriver wd;
    
    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.gecko.driver", "C://Users//SERG//Downloads//TestAutomationLessons//geckodriver.exe");
   	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
   	  capabilities.setCapability("marionette", true);
   	  wd = new MarionetteDriver(capabilities); 
        //wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void SeleniumBuilderTestCase1() {
        wd.get("resource://vkd/data/newtab/index.html");
        wd.get("https://www.tutorialspoint.com/");
        wd.findElement(By.linkText("Learn Java")).click();
        if (!wd.findElement(By.xpath("//div[3]/div[1]/div/div[1]/aside/ul[1]/li[1]")).getText().equals("Java Tutorial")) {
            System.out.println("verifyText failed");
        }
        wd.findElement(By.linkText("Java - Numbers")).click();
        assertTrue(wd.findElement(By.tagName("html")).getText().contains("Java - Numbers"));
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
