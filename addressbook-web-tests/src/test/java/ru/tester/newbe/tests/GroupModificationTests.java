package ru.tester.newbe.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.tester.newbe.model.GroupData;

public class GroupModificationTests extends TestBase{

   @Test
   public void testGroupMidification() {
      app.getNavigationHelper().gotoGroupPage();
      int before = app.getGroupHelper().getGroupCount();
      app.getGroupHelper().selectGroup(before - 1);
      app.getGroupHelper().initGroupModofication();
      app.getGroupHelper().fillGroupForm(new GroupData("editName", "editHeader", "editFooter"));
      app.getGroupHelper().submitGroupModofication();
      app.getGroupHelper().returnToGroupPage();
      int after = app.getGroupHelper().getGroupCount();
      Assert.assertEquals(before, after);
   }

}
