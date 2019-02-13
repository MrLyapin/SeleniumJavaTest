package ru.tester.newbe.tests;

import org.testng.annotations.Test;
import ru.tester.newbe.model.UserData;

public class UserDeletionTests extends TestBase {

   @Test
   public void testUserDeletion() {


      app.getUserHelper().selectUser();
      app.getUserHelper().deleteSelectedUser();
      app.getNavigationHelper().confirmation();

   }
}
