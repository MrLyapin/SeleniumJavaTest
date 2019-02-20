package ru.tester.newbe.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();

    int before = app.getGroupHelper().getGroupCount();

    app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();

    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(before - 1, after );
  }

}
