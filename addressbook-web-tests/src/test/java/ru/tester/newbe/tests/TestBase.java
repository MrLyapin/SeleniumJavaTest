package ru.tester.newbe.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.tester.newbe.appmanager.ApplicationManager;

public class TestBase {

   protected final ApplicationManager app = new ApplicationManager();

   @BeforeMethod(alwaysRun = true)
   public void setUp() throws Exception {
      app.init();
   }

   @AfterMethod(alwaysRun = true)
   public void tearDown() throws Exception {
      app.stop();
   }

   public ApplicationManager getApp() {
      return app;
   }
}
