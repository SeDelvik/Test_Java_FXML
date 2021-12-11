package test;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class TextClassBlyat implements Initializable {
    @FXML
    private Text text1;
    @FXML
    private ListView<MrCl> listObj;
    @FXML
    private Text curObj;

    private StringProperty sheesh = new SimpleStringProperty();
    private ObservableList<MrCl> list;

    public void setText(){
        sheesh.set("ora");
    }

    public void changeText(){
        sheesh.set(sheesh.getValue()+"1");
    }

    public void setData(ObservableList<MrCl> data){
        list = data;
        listObj.setItems(data);

        listObj.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            if(newValue!=null) curObj.setText(newValue.toString());
        });
        listObj.getSelectionModel().selectFirst();
    }
    public void putNew(){
        list.add(new MrCl("1"));
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setText();
        text1.textProperty().bind(this.sheesh);
    }
}
