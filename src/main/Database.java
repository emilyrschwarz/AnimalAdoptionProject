package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Wrapper around the database to facilitate requests. Commands and actions relating to the database
 * should go through here.
 */
public class Database {
  private static Database thisDb;

  private Connection conn;

  private Database() {
    try {
      Connection conn = DriverManager.getConnection("jdbc:sqlite:./res/shelter.db");
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("There was an issue connecting to the database.");
    }
  }

  public static Database get() {
    if (thisDb == null) {
      thisDb = new Database();
    }
    return thisDb;
  }


}
