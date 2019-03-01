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
        try {
            //Попробуй тут
            String inputString = inputTextField.getText();
            Integer inputNumber = Integer.parseInt(inputString);
            String result = Integer.toHexString(inputNumber);
            resultLabel.setText(result);
        } catch (Exception e) {
            //Если что то не получилось выведи ошибку
            resultLabel.setText("Неправльный ввод");
        }
    }

    public void convertToOctal(ActionEvent event) {
        try {
            //Попробуй тут
            String inputString = inputTextField.getText();
            Integer inputNumber = Integer.parseInt(inputString);
            String result = Integer.toOctalString(inputNumber);
            resultLabel.setText(result);
        } catch (Exception e) {
            //Если что то не получилось выведи ошибку
            resultLabel.setText("Неправльный ввод");
        }
    }
}
