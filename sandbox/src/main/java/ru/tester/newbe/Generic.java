package ru.tester.newbe;

public class Generic {
   public static void main(String[] args) {

      MyCastomArrayList<String> string = new MyCastomArrayList<>();


      string.add("Hello 1");
      string.add("Hello 2");
      string.add("Hello 3");
      string.add("Hello 4");

      printGeneric(string);

      string.del(3);
      string.add("Hello 5");
      string.del(0);
      printGeneric(string);



      function(12);
      function("Hello !");
      function(4.5);

      print2(12);
      print2("Hello !");
      print2(4.5);

   }
   public static <T> void print2(T param) {
      System.out.println(param.toString() + " +2");
   }


   public static <T> void function(T param) { // Тест обобщеных методов
      System.out.println(param.toString());
   }

   public static void printGeneric(MyCastomArrayList param){
      for(int i = 0;i < param.getLength(); i++) {
         System.out.println(param.get(i));
      }

   }
}
