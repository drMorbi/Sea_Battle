import java.util.Arrays;

public class Game {
    public static void main(String[] args) {

        BattleField bf = new BattleField();
        BattleField bfEnemy = new BattleField();
        Player player1 = new Player();
        Player player2 = new Player();

//        System.out.println("ИГРА НАЧИТАЕТСЯ!");
      //  bf.fillField();
      //  bfEnemy.fillField();
      //  bf.printField();
//        bfEnemy.printField();
        player1.setBfe(bf.fillField());
        player1.getBfeAttack(bf.fillField());
        player1.getBfe(bf.printField());

        Ship ship = new Ship();
        player1.placementShips(player1, ship);
    }
}
