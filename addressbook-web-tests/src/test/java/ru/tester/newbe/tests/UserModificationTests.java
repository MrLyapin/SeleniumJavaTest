package ru.tester.newbe.tests;

import org.testng.annotations.Test;
import ru.tester.newbe.model.UserData;

public class UserModificationTests extends TestBase {

   @Test
   private void testUserModofication() {

      app.getUserHelper().selectAndEditUserForm();
      app.getUserHelper().fillUserForm(new UserData("EditJohn", "EditDow", "EditSecret", "EditJohn@gmail.com","333-333-33-33"));
      app.getUserHelper().submitUserEdit();

   }
}
