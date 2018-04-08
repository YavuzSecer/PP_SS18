package Logic;

public abstract class Stone {


    private String stoneID;

    private boolean iced;

    private boolean movable = false;

    private StoneType sType = StoneType.WALL;

    private Color color;

    private Direction dir;


    public Stone(StoneType sType, Color color, boolean iced, Direction dir) {
        this.sType = sType;
        this.color = color;
        this.iced = iced;
        this.dir = dir;
        this.stoneID = generateStoneID();
    }

    private String generateStoneID() {
        StringBuilder sb = new StringBuilder();

        if (this.sType == StoneType.WALL)
            sb.append("m");
        else if (this.sType == StoneType.DIAMOND)
            sb.append("d");
        else {
            if (this.iced)
                sb.append("i");
            else
                sb.append(this.dir.value);

            sb.append(this.color.value);
        }
        return sb.toString();
    }

    public String getStoneID() {
        return stoneID;
    }

    public void freezeGem() {
        if (!this.iced) {
            this.iced = true;
            StringBuilder sb = new StringBuilder();
            sb.append("i");
            this.stoneID = sb.append(this.stoneID).toString();
        }
    }

    public void setStoneType(StoneType sType) {
        this.sType = sType;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }

    public String getstoneToken() {
        String token = "";
        if (this.sType == StoneType.WALL) {
            token = "wall";
        } else if (this.sType == StoneType.DIAMOND) {
            token = "diamond";
        } else if (this.sType == StoneType.DIR_GEM) {
            switch (this.color) {
                case BLUE: token = "dirBlue"; break;
                case GREEN: token = "dirGreen"; break;
                case YELLOW: token = "dirYellow"; break;
                case WHITE: token = "dirWhite"; break;
                case RED: token = "dirRed"; break;
                case PINK: token = "dirPink"; break;
            }
        } else if (this.sType == StoneType.GEM) {
            switch (this.color) {
                case BLUE: token = (this.iced)
                        ? "blue_ice"
                        : "blue";
                    break;
                case GREEN: token = (this.iced)
                        ? "green_ice"
                        : "green";
                    break;
                case YELLOW: token = (this.iced)
                        ? "yellow_ice"
                        : "yellow";
                    break;
                case WHITE: token = (this.iced)
                        ? "white_ice"
                        : "white";
                    break;
                case RED: token = (this.iced)
                        ? "red_ice"
                        : "red";
                    break;
                case PINK: token = (this.iced)
                        ? "pink_ice"
                        : "pink";
                    break;
            }
        }
        return token;
    }
}
