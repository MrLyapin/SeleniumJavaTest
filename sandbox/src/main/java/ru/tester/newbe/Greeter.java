package ru.tester.newbe;

public class Greeter {

   public void greet() {
      System.out.println("Hello, people!");
   }
}

//class TimedGreeter extends Greeter {
//
//   public void greet() {
//      Timer t = new Timer(1000, super::greet);
//      t.start();
//   }
//}