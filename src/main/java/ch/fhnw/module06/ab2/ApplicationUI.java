package ch.fhnw.module06.ab2;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox{
	
	private Button button;
	private Label label;
	private TextField txtf;
	private TextArea txta;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		button = new Button("Button");
		label = new Label("Label");
		txtf = new TextField("TextFeld");
		txta = new TextArea("TextArea");
	}
	
	private void layoutControls() {
		this.setPadding(new Insets(10));
		ApplicationUI.setMargin(button, new Insets(5,0,0,0));

		this.getChildren().add(label);
		this.getChildren().add(txtf);
		this.getChildren().add(txta);
		this.getChildren().add(button);
	}
}