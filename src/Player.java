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


    public void attack(Player player){

    }
}
