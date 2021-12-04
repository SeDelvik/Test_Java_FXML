package test;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class TextClassBlyat implements Initializable {
    @FXML
    private Text text1;

    private StringProperty sheesh = new SimpleStringProperty();

    public void changeText(){
        sheesh.set(sheesh.getValue()+"1");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sheesh.set("ora");
        text1.textProperty().bind(this.sheesh);
    }
}
