package ru.tester.newbe.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.tester.newbe.model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();

    //int before = app.getGroupHelper().getGroupCount();
    List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();

    Assert.assertEquals(before.size() + 1, after.size() );
  }

}
