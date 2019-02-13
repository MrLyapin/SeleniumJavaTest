package ru.tester.newbe.model;

public class UserData {

      private final String firstname;
      private final String lastname;
      private final String nickname;
      private final String email;
      private final String home;


   public UserData(String firstname, String lastname, String nickname, String email, String home) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.nickname = nickname;
      this.email = email;
      this.home = home;
   }

   public String getFirstname() {
      return firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public String getNickname() {
      return nickname;
   }

   public String getEmail() {
      return email;
   }

   public String getHome() {
      return home;
   }
}

