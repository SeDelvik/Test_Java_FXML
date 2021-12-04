package test;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lil' pet");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TextClassBlyat.fxml"));
        Parent mainView = loader.load(); //тут происходит загрузка вью и инициализация контроллера ( через метод initialize)
        TextClassBlyat controller = loader.getController();


        Scene scene = new Scene(mainView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
