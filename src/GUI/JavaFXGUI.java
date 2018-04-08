package GUI;

import Logic.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class JavaFXGUI implements GUIConnector {

    private Label lvlLbl;

    private Label scoreLbl;

    private Label movesLbl;

    private Label questLbl;

    private GridPane boardGPane;

    private Button btnNext;

    private Button btnPrevious;

    private String preImagePath = "GUI/stoneImages/";

    public JavaFXGUI(Label lvlLbl,
                     Label scoreLbl,
                     Label movesLbl,
                     Label questLbl,
                     GridPane board,
                     Button btnNext,
                     Button btnPrevious) {

        this.lvlLbl = lvlLbl;
        this.scoreLbl = scoreLbl;
        this.movesLbl = movesLbl;
        this.questLbl = questLbl;
        this.boardGPane = board;
        this.btnNext = btnNext;
        this.btnPrevious = btnPrevious;
    }

    public void showLevelNo(int lvlNo) {
        this.lvlLbl.setText(String.valueOf(lvlNo));
    }

    public void showScore(int score) {
        this.scoreLbl.setText(String.valueOf(score));
    }

    public void showMoves(int moves) {
        this.movesLbl.setText(String.valueOf(moves));
    }

    public void showQuest(String quest) {
        this.questLbl.setText(quest);
    }

    public void showStoneImages(GameField gameField) {
        ImageView[][] imageViews = initImages();
        for (int row = 0; row < LogicConstants.BOARD_ROWS; row++) {
            for (int col = 0; col < LogicConstants.BOARD_COLS; col++) {
                imageViews[row][col].setImage(new Image(preImagePath + gameField.getStoneAt(row, col).getstoneToken() + ".png"));
            }
        }
    }

    private ImageView[][] initImages() {

        int colcount = this.boardGPane.getColumnConstraints().size();
        int rowcount = this.boardGPane.getRowConstraints().size();
        // bind each Imageview to a cell of the gridpane
        int cellWidth = (int) this.boardGPane.getWidth() / colcount;
        int cellHeight = (int) this.boardGPane.getHeight() / rowcount;
        ImageView[][] imageViews = new ImageView[rowcount][colcount];
        for (int x = 0; x < colcount; x++) {
            for (int y = 0; y < rowcount; y++) {
                //creates an empty imageview
                imageViews[x][y] = new ImageView();

                //add the imageview to the cell and
                //assign the correct indicees for this imageview, so you later can use GridPane.getColumnIndex(Node)
                this.boardGPane.add(imageViews[x][y], x, y);

                //the image shall resize when the cell resizes
                imageViews[x][y].fitWidthProperty().bind(this.boardGPane.widthProperty().divide(colcount));
                imageViews[x][y].fitHeightProperty().bind(this.boardGPane.heightProperty().divide(rowcount));
            }
        }
        return imageViews;
    }

}
