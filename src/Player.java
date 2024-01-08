import java.util.Scanner;

public class Player {
    private BattleField bfe = new BattleField();
    private BattleField bfeAttack = new BattleField();
    private boolean valid = false;

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

    public void game() {
        Ship ship = new Ship();
        ValidEnter vl = new ValidEnter();
        while (!valid) {
            System.out.println("111");
            valid = vl.validationEnter() && vl.stringToInt() && vl.vaEn();
        }
        bfe.setBattle(ship);
    }


    public void attack(Player player) {

    }
}
