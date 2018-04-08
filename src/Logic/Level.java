package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level {

    private int levelID;

    private ArrayList<Color> startingRestriction;

    private ArrayList<Color> cavingRestriction;

    private int moves;

    private LevelQuest lQuest;

    private int[][] wallCoords;

    private int[][] iceCoords;

    public Level(int levelID,
          Color[] startingStoneColors,
          Color[] cavingStoneColors,
          int moves,
          LevelQuest lQuest,
          int[][] wallCoords,
          int[][] iceCoords) {

        this.levelID = levelID;
        this.startingRestriction = colorSet(startingStoneColors);
        this.cavingRestriction = colorSet(cavingStoneColors);
        this.moves = moves;
        this.lQuest = lQuest;
        this.wallCoords = wallCoords;
        this.iceCoords = iceCoords;
    }

    private ArrayList<Color> colorSet(Color[] colors) {

        ArrayList<Color> remainingColors = new ArrayList<>();
        List<Color> cList = Arrays.asList(Color.values());
        cList.forEach(elem -> {
            if (!Arrays.asList(colors).contains(elem) && elem != Color.ANY)
                remainingColors.add(elem);
        });
        return remainingColors;
    }

    //  Getters

    public int getLevelID() {
        return levelID;
    }

    public int getMoves() {
        return moves;
    }

    public LevelQuest getlQuest() {
        return lQuest;
    }

    public ArrayList<Color> getCavingRestriction() {
        return cavingRestriction;
    }

    public ArrayList<Color> getStartingRestriction() {
        return startingRestriction;
    }

    public int[][] getIceCoords() {
        return this.iceCoords;
    }

    public int[][] getWallCoords() {
        return wallCoords;
    }

    public String questAsStr() {
        return this.lQuest.printLevelGoal();
    }

//    public void printLevel() {
//        System.out.println("Level ID = " + this.levelID + "\n" +
//                "Allowed Starting Stones = " + this.startingRestriction.toString() + "\n" +
//                "Allowed Caving Stones = " + this.cavingRestriction.toString() + "\n" +
//                "Move count = " + this.moves);
//    }







}
