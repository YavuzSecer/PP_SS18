package Logic;


import java.util.*;


public class LevelPool {

    private final Map<Integer, Level> lvlPool;

    private final int[][] noOccurrence  = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public LevelPool() {

        this.lvlPool = new HashMap<>();
        initLevelPool();
    }


    private void initLevelPool() {

        this.lvlPool.put(1, new Level(1, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 25,
                new LevelQuest(2250, 0, 0, 0, 0, false, Color.ANY),
                noOccurrence,
                noOccurrence));

        this.lvlPool.put(2, new Level(2, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 20,
                new LevelQuest(0, 65, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1}},
                noOccurrence));

        this.lvlPool.put(3, new Level(3, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 15,
                new LevelQuest(2250, 0, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1}},
                noOccurrence));

        this.lvlPool.put(4, new Level(4, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 15,
                new LevelQuest(0, 50, 0, 0, 0, true, Color.ANY),
                noOccurrence,
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0}}));

        this.lvlPool.put(5, new Level(5, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 15,
                new LevelQuest(0, 0, 16, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(6, new Level(6, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 15,
                new LevelQuest(0, 13, 0, 0, 0, false, Color.RED),
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(7, new Level(7, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 21,
                new LevelQuest(5000, 0, 0, 0, 0, true, Color.ANY),
                noOccurrence,
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0}}));

        this.lvlPool.put(8, new Level(8, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 16,
                new LevelQuest(0, 130, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1}},
                noOccurrence));

        this.lvlPool.put(9, new Level(9, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 15,
                new LevelQuest(4500, 0, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 0, 0}},
                noOccurrence));

        this.lvlPool.put(10, new Level(10, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 20,
                new LevelQuest(4500, 37, 0, 0, 0, false, Color.PINK),
                new int[][]{
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 0, 1, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 1, 0, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(11, new Level(11, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 22,
                new LevelQuest(5000, 0, 0, 0, 0, true, Color.ANY),
                noOccurrence,
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 1, 1, 1, 1, 1, 0, 0},
                        {0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0}}));

        this.lvlPool.put(12, new Level(12, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 15,
                new LevelQuest(0, 0, 0, 7, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1, 1, 0, 0, 1},
                        {1, 0, 1, 1, 1, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(13, new Level(13, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 10,
                new LevelQuest(0, 45, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0}},
                noOccurrence));

        this.lvlPool.put(14, new Level(14, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 27,
                new LevelQuest(0, 33, 0, 0, 0, true, Color.WHITE),
                noOccurrence,
                new int[][]{
                        {1, 1, 0, 1, 1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 1, 0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1, 0, 0, 1, 1},
                        {1, 0, 0, 1, 0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1, 1, 0, 1, 1}}));

        this.lvlPool.put(15, new Level(15, new Color[]{Color.BLUE, Color.YELLOW},
                new Color[]{Color.BLUE, Color.YELLOW}, 12,
                new LevelQuest(0, 0, 0, 13, 0, false, Color.ANY),
                new int[][]{
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0}},
                noOccurrence));

        this.lvlPool.put(16, new Level(16, new Color[]{Color.BLUE}, new Color[]{Color.BLUE}, 20,
                new LevelQuest(0, 100, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(17, new Level(17, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 30,
                new LevelQuest(0, 0, 0, 0, 2, true, Color.ANY),
                noOccurrence,
                new int[][]{
                        {1, 0, 1, 0, 1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1},
                        {0, 1, 0, 1, 0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1, 0, 1, 0, 1}}));

        this.lvlPool.put(18, new Level(18, new Color[]{Color.BLUE, Color.WHITE},
                new Color[]{Color.ANY}, 15, new LevelQuest(0, 13, 0, 0, 0, false, Color.BLUE),
                new int[][]{
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 1, 0, 1, 0, 0},
                        {0, 0, 1, 0, 1, 0, 1, 0, 0},
                        {1, 0, 1, 1, 1, 1, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(19, new Level(19, new Color[]{Color.ANY}, new Color[]{Color.ANY}, 17,
                new LevelQuest(3200, 80, 0, 0, 0, false, Color.ANY),
                new int[][]{
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 1, 0, 0, 0, 1, 0, 1},
                        {1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1}},
                noOccurrence));

        this.lvlPool.put(20, new Level(20, new Color[]{Color.BLUE, Color.YELLOW},
                new Color[]{Color.BLUE, Color.YELLOW}, 20,
                new LevelQuest(6000, 0, 0, 5, 0, false, Color.ANY),
                new int[][]{
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0, 1, 0, 0, 0}},
                noOccurrence));
    }

    public Level getLevelFromPool(int i) {
        return this.lvlPool.get(i);
    }
}

