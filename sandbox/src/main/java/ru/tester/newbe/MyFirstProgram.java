package ru.tester.newbe;

public  class MyFirstProgram {

  public static void main(String[] args) {

    hello("user");
    hello("world");


    Square s = new Square(5);

    System.out.println("Square area " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,5);

    System.out.println("The area of the rectangle with sides " + r.a + " and " + r.b + " = " + r.area());
  }


  public static void hello(String somebody) {

    System.out.println("Hello "+ somebody +"!");

  }

}

