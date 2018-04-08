package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;

import Logic.GUIConnector;
import Logic.GameLogic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import Logic.Level;
import Logic.LevelPool;


/**
 *
 * @author Yavuz
 */
public class DiamantenfieberFXMLController implements Initializable {

    @FXML
    private GridPane gameBoard;
    @FXML
    private Button btnNext;
    @FXML
    private Button btnPrevious;
    @FXML
    private Label rightLevelLbl;
    @FXML
    private Label leftLevelLbl;
    @FXML
    private Label rightScoreLbl;
    @FXML
    private Label leftScoreLbl;
    @FXML
    private Label rightMovesLbl;
    @FXML
    private Label leftMovesLbl;
    @FXML
    private Label aboveQuestLbl;
    @FXML
    private Label belowQuestLbl;
    @FXML
    private Pane movesPane;
    @FXML
    private Pane levelPane;
    @FXML
    private Pane questPaneAbove;
    @FXML
    private Pane questPaneBelow;
    @FXML
    private Pane scoresPane;
    
    private GameLogic logic;
    
    private GUIConnector gui;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        gui = new JavaFXGUI(this.rightLevelLbl,
                            this.rightScoreLbl,
                            this.rightMovesLbl,
                            this.belowQuestLbl,
                            this.gameBoard,
                            this.btnNext,
                            this.btnPrevious);
        
        logic = new GameLogic(gui);
        initDefaultLabels();
    }

    private void initDefaultLabels() {

        this.leftLevelLbl.setText("Level");
        this.leftLevelLbl.layoutXProperty().bind(this.levelPane.widthProperty().divide(5));
        this.leftLevelLbl.layoutYProperty().bind(this.levelPane.heightProperty().divide(2));
        this.rightLevelLbl.layoutXProperty().bind(this.levelPane.widthProperty().divide(5));
        this.rightLevelLbl.layoutYProperty().bind(this.levelPane.heightProperty().divide(2));

        this.leftScoreLbl.setText("Score");
        this.leftScoreLbl.layoutXProperty().bind(this.scoresPane.widthProperty().divide(5));
        this.leftScoreLbl.layoutYProperty().bind(this.scoresPane.heightProperty().divide(2));
        this.rightScoreLbl.layoutXProperty().bind(this.scoresPane.widthProperty().divide(5));
        this.rightScoreLbl.layoutYProperty().bind(this.scoresPane.heightProperty().divide(2));

        this.leftMovesLbl.setText("Moves");
        this.leftMovesLbl.layoutXProperty().bind(this.movesPane.widthProperty().divide(5));
        this.leftMovesLbl.layoutYProperty().bind(this.movesPane.heightProperty().divide(2));
        this.rightMovesLbl.layoutXProperty().bind(this.movesPane.widthProperty().divide(5));
        this.rightMovesLbl.layoutYProperty().bind(this.movesPane.heightProperty().divide(2));

        this.aboveQuestLbl.setText("Quest :");
        this.aboveQuestLbl.layoutXProperty().bind(this.questPaneAbove.widthProperty().divide(5));
        this.aboveQuestLbl.layoutYProperty().bind(this.questPaneAbove.heightProperty());
        this.belowQuestLbl.layoutXProperty().bind(this.questPaneBelow.widthProperty().divide(5));
        this.belowQuestLbl.layoutYProperty().bind(this.questPaneBelow.heightProperty().divide(2));
    }
}
