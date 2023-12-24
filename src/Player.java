import java.util.Scanner;

public class Player {
    private BattleField bfe = new BattleField();
    private BattleField bfeAttack = new BattleField();

    public BattleField getBfe(BattleField bfe) {
        return bfe;
    }

    public void setBfe(BattleField bfe) {
        this.bfe = bfe;
    }

    public BattleField getBfeAttack(BattleField bfeAttack) {
        return bfeAttack;
    }

    public void setBfeAttack(BattleField bfeAttack) {
        this.bfeAttack = bfeAttack;
    }

    public void placementShips(Player player, Ship ship){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] n = s.split(",");
        ship.setPointX(Integer.parseInt(n[0]));
        ship.setPointY(Integer.parseInt(n[1]));
        ship.setDecks(Integer.parseInt(n[2]));
        System.out.println(ship.getPointX() + " " + ship.getPointY() + " " + ship.getDecks());
    }

    public void attack(Player player){

    }
}
