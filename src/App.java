import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = getClass().getResource("/view/telaprincipal.fxml");
        Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Cadastro de servicos");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    
    }
}
