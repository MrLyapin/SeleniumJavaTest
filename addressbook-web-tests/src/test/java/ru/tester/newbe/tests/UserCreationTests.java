package ru.tester.newbe.tests;

import org.testng.annotations.Test;
import ru.tester.newbe.model.UserData;

public class UserCreationTests extends TestBase {

   @Test
   public void testUserCreation() {

         app.getUserHelper().initUserCreation();
         app.getUserHelper().fillUserForm(new UserData("John", "2Dow", "secret", "john@gmail.com", "234-345-34-23"));
         app.getUserHelper().submitUserCreation();
         app.getUserHelper().returnToHomepPage();


   }

}
