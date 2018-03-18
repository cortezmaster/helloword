package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLButtonController implements Initializable {

	@FXML
	private Label label;
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("Clique em MIM");
		label.setText("Olá mundo!");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
