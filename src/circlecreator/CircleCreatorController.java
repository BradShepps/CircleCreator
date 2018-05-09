/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecreator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author bradsheppard
 */
public class CircleCreatorController implements Initializable {

    @FXML
    private TextField radiusField;
    @FXML
    private Button circleButton;
    @FXML
    private Text radiusOutput;
    @FXML
    private Text diameterOutput;
    @FXML
    private Text areaOutput;
    @FXML
    private Text circumferenceOutput;
    @FXML
    private Canvas canvas;

    @FXML
    private AnchorPane anchorPane;

    int numClicks = 0;
    @FXML
    private AnchorPane AnchorPane2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void makeCircle(ActionEvent event) {
        double radius = Double.parseDouble(radiusField.getText());
        double diameter = radius * 2;
        Circle circle = new Circle(100, 50, radius);
        AnchorPane2.getChildren().clear();
        AnchorPane2.getChildren().add(circle);
        radiusOutput.setText("Radius:" + " " + radius);
        diameterOutput.setText("Diameter:" + " " + diameter);
        circumferenceOutput.setText("Circumference:" + " " + diameter + "π");
        areaOutput.setText("Area" + " " + Math.floor(Math.pow(radius, 2)) + "π");

    }

    private void draw(GraphicsContext gc) {

    }

}
