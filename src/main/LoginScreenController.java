package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginScreenController {

  @FXML
  private AnchorPane errorLabel;

  @FXML
  private TextField usernameText;

  @FXML
  private TextField passwordText;

  @FXML
  private Button loginButton;

  @FXML
  void pressedLogin(ActionEvent event) {
    System.out.println("User logged in!");
  }
}
