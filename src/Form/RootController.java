package Form;

import java.util.ArrayList;

import Bot.Bot;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController {

    @FXML private Button say;
    @FXML private TextField textField;
    public static Bot bot;
    private ArrayList<String> log = new ArrayList<String>();
    
    @FXML
    public void initialize() throws Exception{
    	bot = new Bot();
    }
    
    public void say() throws Exception{
    	if(!textField.getText().isEmpty())
    		bot.tell(textField.getText());
    }

}
