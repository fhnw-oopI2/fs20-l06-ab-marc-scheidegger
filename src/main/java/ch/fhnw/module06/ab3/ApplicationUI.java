package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane{

		private Button buttonT;
		private Button buttonL;
		private Button buttonR;
		private Button buttonB;
		private TextArea txta;
		
		public ApplicationUI() {
			initializeControls();
			layoutControls();
		}
		private void initializeControls() {
			buttonT = new Button("Top");
			buttonL = new Button("Left");
			buttonR = new Button("Right");
			buttonB = new Button("Bottom");
			txta = new TextArea("TextArea");
		}
		
		private void layoutControls() {
			setPadding(new Insets(10));
			
			setTop(buttonT);
			buttonT.setMaxWidth(2000);
			
			setLeft(buttonL);
			ApplicationUI.setMargin(buttonL, new Insets(5,0,0,0));
			
			setRight(buttonR);
			ApplicationUI.setMargin(buttonR, new Insets(5,0,0,0));
			
			setBottom(buttonB);
			buttonB.setMaxWidth(2000);
			ApplicationUI.setMargin(buttonR, new Insets(5,0,0,0));
			
			setCenter(txta);
			ApplicationUI.setMargin(txta, new Insets(5,5,5,5));
		}	

	
}