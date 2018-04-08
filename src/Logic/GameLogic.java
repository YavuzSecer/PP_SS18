package Logic;

import java.io.File;

public class GameLogic {

    private GUIConnector gui;

    private GameField gameField;

    private LevelPool lvlPool = new LevelPool();

    private Level currentLvl;

    private int lvlNo;

    private int score;

    private int remainingMoves;

    private String quest;


    public GameLogic(GUIConnector gui) {

        this.gui = gui;
        this.gameField = new GameField();
        this.currentLvl = lvlPool.getLevelFromPool(LogicConstants.firstLevel);
        initFirstLevel();
    }

    private void setScore(int score) {

        this.score = score;
        gui.showScore(score);
    }

    private void setLevelNo(int lvlNo) {

        this.lvlNo = lvlNo;
        gui.showLevelNo(lvlNo);
    }

    private void setMoves(int moves) {

        this.remainingMoves = moves;
        gui.showMoves(moves);
    }

    private void setQuest(String quest) {

        this.quest = quest;
        gui.showQuest(quest);
    }

    private void setBoard(GameField gameField) {
        this.gameField = gameField;
        gui.showStoneImages(gameField);
    }

    private void initFirstLevel() {
        this.gameField.setLevel(4);
        setBoard(gameField);

        // Labels initialisieren mit Werten des ersten Levels
        setLevelNo(currentLvl.getLevelID());
        setScore(0);
        setMoves(currentLvl.getMoves());
        setQuest(currentLvl.getlQuest().printLevelGoal());

    }

    protected void setSituation(String situation) {

        // Definierte Spielsituation
    }

    protected void setSituation(File file) {

        // Laden einer gespeicherten Spielsituation
    }

    public GameField getGameField() {
        return gameField;
    }
}
