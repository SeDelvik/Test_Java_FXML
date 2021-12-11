package test;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class Main extends Application {
    MrCl obj1 = new MrCl("1");
    ObservableList<MrCl> data = FXCollections.observableArrayList(obj1);
    //ListView<MrCl> listView = new ListView<>(data);
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lil' pet");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TextClassBlyat.fxml"));
        Parent mainView = loader.load(); //тут происходит загрузка вью и инициализация контроллера ( через метод initialize)

        TextClassBlyat controller = loader.getController();
        //controller.setText();
        controller.setData(data);
        data.add(new MrCl("2"));

        Scene scene = new Scene(mainView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}