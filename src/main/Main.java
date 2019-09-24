package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {
    System.out.println("yuh");

    try {
      Connection conn = DriverManager.getConnection("jdbc:sqlite:./res/shelter.db");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
