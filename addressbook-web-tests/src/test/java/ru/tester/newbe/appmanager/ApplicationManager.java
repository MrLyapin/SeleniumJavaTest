package ru.tester.newbe.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tester.newbe.model.GroupData;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
   private WebDriver driver;
   private String baseUrl;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   public void init() {
      driver = new ChromeDriver();
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
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

   public void returnToGroupPage() {
     driver.findElement(By.linkText("group page")).click();
   }

   public void submitGroupCreation() {
     driver.findElement(By.name("submit")).click();
   }

   public void fillGroupForm(GroupData groupData) {
     driver.findElement(By.name("group_name")).click();
     driver.findElement(By.name("group_name")).clear();
     driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
     driver.findElement(By.name("group_header")).click();
     driver.findElement(By.name("group_header")).clear();
     driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
     driver.findElement(By.name("group_footer")).click();
     driver.findElement(By.name("group_footer")).clear();
     driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
   }

   public void initGroupCreation() {
     driver.findElement(By.name("new")).click();
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

   public void deleteSelectedGroup() {
     driver.findElement(By.name("delete")).click();
   }

   public void selectGroup() {
     driver.findElement(By.name("selected[]")).click();
   }
}