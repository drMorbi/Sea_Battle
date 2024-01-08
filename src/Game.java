public class Game {
    public static void main(String[] args) {

        BattleField bf1 = new BattleField();
        BattleField bf2 = new BattleField();
        Player player1 = new Player();
        Player player2 = new Player();
        Ship ship = new Ship();

//        System.out.println("ИГРА НАЧИТАЕТСЯ!");
        bf1.fillField();
      //  bf2.fillField();
      //  bf1.printField();
//        bf2.printField();
//        player1.setBfe(bf1.fillField());
//        player1.setBfeAttack(bf1.fillField());
//        player1.getBfe(bf1.printField());
//
//        bf1.setBattle(ship);
//        player1.getBfe(bf1.printField());

        player1.game();

    }

}
