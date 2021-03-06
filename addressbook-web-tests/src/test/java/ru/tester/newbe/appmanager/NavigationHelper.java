package ru.tester.newbe.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

   public NavigationHelper(WebDriver driver) {
     super(driver);
   }

   public void gotoGroupPage() {
     click(By.linkText("groups"));
   }

   public void confirmation() {
      driver.switchTo().alert().accept();
   }
}
