package Logic;

import java.util.Random;

public class GameField {

    /**
     * GameField out of Stones
     */
    private Stone[][] board;

    private Level lvl;


    public GameField() {

        this.board = new Stone[LogicConstants.BOARD_ROWS][LogicConstants.BOARD_COLS];
    }


    public void setLevel(int lvlNo) {

        LevelPool lp = new LevelPool();
        this.lvl = lp.getLevelFromPool(lvlNo);

        for (int row = 0; row < LogicConstants.BOARD_ROWS; row++) {
            for (int col = 0; col < LogicConstants.BOARD_COLS; col++) {
                int[][] walls = lvl.getWallCoords();
                if (walls[col][row] == 1)
                    this.board[row][col] = new Wall();
                else {
                    Random randomGenerator = new Random();
                    int index = randomGenerator.nextInt(lvl.getStartingRestriction().size());
                    Color rdmColor = lvl.getStartingRestriction().get(index);

                    this.board[row][col] = (lvl.getIceCoords()[col][row] == 1)
                            ? new Gem(rdmColor, true)
                            : new Gem(rdmColor, false);
                }
            }
        }
    }

    public Stone getStoneAt(int row, int col) {
        return this.board[row][col];
    }

    public void printGameField() {

        for (int x = 0; x < LogicConstants.BOARD_ROWS; x++) {
            for (int y = 0; y < LogicConstants.BOARD_COLS; y++) {
                System.out.print(String.format("%1$-3s", this.board[x][y].getStoneID()));
            }
            System.out.println("\n");
        }
    }

}
