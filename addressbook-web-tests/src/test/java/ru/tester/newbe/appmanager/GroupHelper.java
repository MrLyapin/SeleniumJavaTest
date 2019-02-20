package ru.tester.newbe.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.tester.newbe.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

   public GroupHelper(WebDriver driver) {
      super(driver);
   }


   public void returnToGroupPage() {
      click(By.linkText("group page"));
   }

   public void submitGroupCreation() {
      click(By.name("submit"));
   }

   public void fillGroupForm(GroupData groupData) {
      type(By.name("group_name"), groupData.getName());
      type(By.name("group_header"), groupData.getHeader());
      type(By.name("group_footer"), groupData.getFooter());
   }

   public void initGroupCreation() {
      click(By.name("new"));
   }

   public void deleteSelectedGroup() {
      click(By.name("delete"));
   }

   public void selectGroup(int index) {
      // задал индекс на основе составленного списка
      driver.findElements(By.name("selected[]")).get(index).click();
   }

   public void initGroupModofication() {
      click(By.name("edit"));
   }

   public void submitGroupModofication() {
      click(By.name("update"));
   }

   public int getGroupCount() {
      return driver.findElements(By.name("selected[]")).size();
   }


   // получает список груп-дата из веб элементов
   public List<GroupData> getGroupList() {
      List<GroupData> groups = new ArrayList<GroupData>(); // это финальный - мы его и будем отправлять
      List<WebElement> elements = driver.findElements(By.cssSelector("span.group")); // этот сформирован из текста по группе (только имя)

      for (WebElement element : elements) {
         String name = element.getText();
         GroupData group = new GroupData(name, null, null); //формирует обьекты груп-дата из имени и двух нул обьектов
         groups.add(group); // наполняет список груп-дата обьектами
      }


      return groups;
   }
}
