package ru.tester.newbe;

class BoxPrinter {
   private Object val;

   public BoxPrinter(Object arg) {
      val = arg;
   }

   public String toString() {
      return "{" + val + "}";
   }

   public Object getValue() {
      return val;
   }
}

class Test {
   public static void main(String[] args) {
      BoxPrinter value1 = new BoxPrinter(new Integer(10));
      System.out.println(value1);
      Integer intValue1 = (Integer) value1.getValue();
      BoxPrinter value2 = new BoxPrinter("Hello world");
      System.out.println(value2);

      // Здесь программист допустил ошибку, присваивая
      // переменной типа Integer значение типа String.
      Integer intValue2 = (Integer) value2.getValue();
   }
}
