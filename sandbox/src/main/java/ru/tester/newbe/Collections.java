package ru.tester.newbe;

import java.util.ArrayList;
import java.util.List;

public class Collections {

   public static void main(String[] args) {
      String[] langs = {"JavaScript", "C++", "C#" , "Assembler"};
      List<String> languages = new ArrayList<>();

      languages.add("Java");
      languages.add("JavaScript");
      languages.add("JavaSE");
      languages.add("C#");

      for (String l : langs) {
         System.out.println("Я хочу выучить " + l);
      }

      for (String i : languages) {
         System.out.println(i);
      }

   }
}
