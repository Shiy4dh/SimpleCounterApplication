import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class Controller {
    public int count = 0;
    public Button addButton = null;
    public Label countScreenLabel;


    @FXML
    public void addButtonClicked(Event e){
        count++;
        countScreenLabel.setAlignment(Pos.CENTER);
        countScreenLabel.setText(String.valueOf(count));
        //System.out.println(count);
    }

    @FXML
    public void minusButtonClicked(Event e){
        if(count > 0){
            count--;
            countScreenLabel.setAlignment(Pos.CENTER);
            countScreenLabel.setText(String.valueOf(count));
        }

        //System.out.println(count);
    }

    public void resetButton(Event e){
        count = 0;
        countScreenLabel.setAlignment(Pos.CENTER);
        countScreenLabel.setText(String.valueOf(count));
    }

}
