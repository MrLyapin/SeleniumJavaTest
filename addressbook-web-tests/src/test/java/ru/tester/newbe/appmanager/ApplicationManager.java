package ru.tester.newbe.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {

   WebDriver driver;

   private GroupHelper groupHelper;
   private String baseUrl;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   public void init() {
      driver = new ChromeDriver();
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
      groupHelper = new GroupHelper(driver);        //created driver
      login("admin", "secret");
   }

   private void login(String username, String password) {
     driver.findElement(By.name("user")).click();
     driver.findElement(By.name("user")).clear();
     driver.findElement(By.name("user")).sendKeys(username);
     driver.findElement(By.name("pass")).click();
     driver.findElement(By.name("pass")).clear();
     driver.findElement(By.name("pass")).sendKeys(password);
     driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
   }

   public void gotoGroupPage() {
     driver.findElement(By.linkText("groups")).click();
   }

   public void stop() {
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

   public GroupHelper getGroupHelper() {
      return groupHelper;
   }
}
