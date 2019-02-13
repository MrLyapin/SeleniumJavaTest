package ru.tester.newbe.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {

   WebDriver driver;

   private SessionHelper sessionHelper;
   private NavigationHelper navigationHelper;
   private UserHelper userHelper;
   private GroupHelper groupHelper;
   private String baseUrl;
   private StringBuffer verificationErrors = new StringBuffer();


   public void init() {
      driver = new ChromeDriver();
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
      groupHelper = new GroupHelper(driver);                //created driver
      navigationHelper = new NavigationHelper(driver);      //created driver
      userHelper = new UserHelper(driver);                  //created driver
      sessionHelper = new SessionHelper(driver);
      sessionHelper.login("admin", "secret");
   }



   public void stop() {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
   }



   public GroupHelper getGroupHelper() {
      return groupHelper;
   }

   public NavigationHelper getNavigationHelper() {
      return navigationHelper;
   }

   public UserHelper getUserHelper() {
      return userHelper;
   }
}
