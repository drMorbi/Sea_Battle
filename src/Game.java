public class Game {
    public static void main(String[] args) {

        BattleField bf = new BattleField();
        BattleField bfEnemy = new BattleField();
        Player player1 = new Player();
        Player player2 = new Player();
        Ship ship = new Ship();

//        System.out.println("ИГРА НАЧИТАЕТСЯ!");
      //  bf.fillField();
      //  bfEnemy.fillField();
      //  bf.printField();
//        bfEnemy.printField();
        player1.setBfe(bf.fillField());
        player1.setBfeAttack(bf.fillField());
        player1.getBfe(bf.printField());

        bf.setBattle(ship);
        player1.getBfe(bf.printField());
    }
}
