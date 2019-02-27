package ru.tester.newbe;


import java.util.Arrays;

public class ArrayTest {
   public static void main(String[] args) {
      String[] test = new String[4];
      String[] test2;

      int[] firstArray = {2,4,3,7,8,9,12,45,6,7,90};
      int[] secondArray;

      secondArray = Arrays.copyOf(firstArray, firstArray.length); //копирование массива (что копируем, длинна)
      System.out.println(Arrays.toString(secondArray)); // привели массив к строке и вывели


      Arrays.fill(test, "not empty"); // приверка заливки массива значением
      System.out.println(Arrays.toString(test));

      test2 = Arrays.copyOf(test, test.length); // копируе массив
      System.out.println("equals array: " + Arrays.equals(test, test2)); // проверка на равенства по длинне и содержанию

   }
}
