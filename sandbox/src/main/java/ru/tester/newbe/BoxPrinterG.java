package ru.tester.newbe;

class BoxPrinterG<T> {
   private T val;

   public BoxPrinterG(T arg) {
      val = arg;
   }

   public String toString() {
      return "{" + val + "}";
   }

   public T getValue() {
      return val;
   }
}

class Test2 {
   public static void main(String[] args) {
      BoxPrinterG<Integer> value1 = new BoxPrinterG<Integer>(new Integer(10));
      System.out.println(value1);
      Integer intValue1 = value1.getValue();
      BoxPrinterG<String> value2 = new BoxPrinterG<String>("Hello world");
      System.out.println(value2);

      // Здесь повторяется ошибка предыдущего фрагмента кода
      //Integer intValue2 = value2.getValue();
      String stringValue = value2.getValue();
   }
}
