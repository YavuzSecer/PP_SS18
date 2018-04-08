package Logic;

public class LevelQuest {

    /**
     * points to be reached
     */
    private int points;
    /**
     * Stone Count to be destroyed
     */
    private int stoneCnt;
    /**
     * Tripple-Structure count to be destroyed
     */
    private int trippleStruct;
    /**
     * Quadra-Structure count to be destroyed
     */
    private int quadraStruct;
    /**
     * Penta-Structure count to be destroyed
     */
    private int pentaStruct;
    /**
     * iceStones to be destroyed or naw
     */
    private boolean iceStones;
    /**
     * Stones of certain color to be destroyed
     */
    private Color color;


     public LevelQuest(int points,
                       int stoneCnt,
                       int trippleStruct,
                       int quadraStruct,
                       int pentaStruct,
                       boolean iceStones,
                       Color color) {

        this.points = points;
        this.stoneCnt = stoneCnt;
        this.trippleStruct = trippleStruct;
        this.quadraStruct = quadraStruct;
        this.pentaStruct = pentaStruct;
        this.iceStones = iceStones;
        this.color = color;
        //printLevelGoal();
    }

    public String printLevelGoal(){

        StringBuilder sb = new StringBuilder();
        if (this.points > 0) {
            sb.append("  - reach " + this.points + " points\n");
        }

        if (this.stoneCnt > 0 && this.color != Color.ANY) {
            sb.append("- remove " + this.stoneCnt + " " + this.color.toString().toLowerCase() + " gems\n");
        } else if (this.stoneCnt > 0) {
            sb.append("- remove " + this.stoneCnt + " gems\n");
        }

        if (this.iceStones) {
            sb.append("- remove the entire ice\n");
        }

        if (trippleStruct > 0) {
            sb.append("- remove " + this.trippleStruct + " structures of 3\n");
        }

        if (quadraStruct > 0) {
            sb.append("- remove " + this.quadraStruct + " structures of 4\n");
        }

        if (pentaStruct > 0) {
            sb.append("- remove " + this.pentaStruct + " structures of 5\n");
        }
        return sb.toString();
    }
}
