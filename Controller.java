package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputTextField;

    @FXML
    private Label resultLabel;

    public void convertToHex(ActionEvent event) {
            String inputString = inputTextField.getText();
            Integer inputNumber = Integer.parseInt(inputString);
            String result = Integer.toHexString(inputNumber);
            resultLabel.setText(result);
    }

    public void convertToOctal(ActionEvent event) {
            String inputString = inputTextField.getText();
            Integer inputNumber = Integer.parseInt(inputString);
            String result = Integer.toOctalString(inputNumber);
            resultLabel.setText(result);
    }
}
