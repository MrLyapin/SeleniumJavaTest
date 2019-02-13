package ru.tester.newbe.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.tester.newbe.model.UserData;

public class UserHelper extends HelperBase {
   public UserHelper(WebDriver driver) {
      super(driver);
   }

   public void initUserCreation() {
      click(By.linkText("add new"));
   }

   public void fillUserForm(UserData userData) {
      type(By.name("firstname"), "name");
      type(By.name("lastname"), "lastname");
      type(By.name("nickname"), "nickname");
      type(By.name("email"), "name@domen.com");
      type(By.name("home"), "2222222222");
   }

   public void submitUserCreation() {
      click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
   }

   public void returnToHomepPage() {
      click(By.linkText("home page"));
   }

   public void selectUser() {
      click(By.name("selected[]"));
   }

   public void deleteSelectedUser() {
      click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]"));
   }

   public void selectAndEditUserForm() {
      click(By.xpath("(.//*[@id='maintable']/tbody/tr[1]/td[8]/a/img))"));
   }

   public void submitUserEdit() {
      click(By.name("Update"));
   }
}



//   public void selectAndEditUserForm() {
//      click(By.xpath("(.//*[@id='maintable']/tbody/tr[]/td[8]/a/img))"));
//   }