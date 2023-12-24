import java.util.Scanner;

public class Ship {
    private int decks;
    private int pointX;
    private int pointY;
    private int orientation;

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }


    public boolean checkCoordEnter(Player player, BattleField battleField, Ship ship){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] n = s.split(",");
        ship.setPointX(Integer.parseInt(n[0]));
        ship.setPointY(Integer.parseInt(n[1]));
        ship.setDecks(Integer.parseInt(n[2]));
        ship.setOrientation(Integer.parseInt(n[3]));

        return true;
    }

}
