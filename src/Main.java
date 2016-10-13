import Bot.Bot;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		try{
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Form/Root.fxml"));
    		Parent parent = (Parent)fxmlLoader.load();
    		Scene scene = new Scene(parent);
    		// scene.getStylesheets().add(getClass().getResource("css/style.css").toExternalForm());
    		stage.setTitle("Application");
    		stage.setScene(scene);
//    		stage.getIcons().addAll(
//    			    new Image("file:icon64x64.png"),
//    			    new Image("file:icon32x32.png"),
//    			    new Image("file:icon16x16.png")
//    			);
    		stage.show();
    	}
    	catch(Exception ex){
    		System.out.print(ex);
    	}    
	}


}
