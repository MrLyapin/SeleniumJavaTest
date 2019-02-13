package ru.tester.newbe.tests;

import org.testng.annotations.Test;
import ru.tester.newbe.model.GroupData;

public class GroupModificationTests extends TestBase{

   @Test
   public void testGroupMidification() {
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().initGroupModofication();
      app.getGroupHelper().fillGroupForm(new GroupData("editName", "editHeader", "editFooter"));
      app.getGroupHelper().submitGroupModofication();
      app.getGroupHelper().returnToGroupPage();
   }

}
