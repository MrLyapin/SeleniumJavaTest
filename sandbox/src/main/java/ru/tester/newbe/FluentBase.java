package ru.tester.newbe;

public class FluentBase {
   protected static final FluManager app = new FluManager();
   protected static final Erase ere = new Erase();



   public FluManager getApp() {
      return app;
   }
   public Erase getEra() {
      return ere;
   }
}
