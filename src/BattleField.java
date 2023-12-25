import java.util.Arrays;

public class BattleField {
    private String[][] battleField = new String[11][11];
    private final String space = "⬜";
    private final String ship = "🟪";
    private final String strike = "🟥";
    private final String miss = "🟦";




    public void setBattle(Ship ship) {
        Player player = new Player();
        BattleField battleField = new BattleField();
        if (ship.checkCoordEnter(player, battleField, ship)) {
            int a = ship.getPointY();
            int b = ship.getPointX();
            int c = ship.getDecks();

            switch (ship.getOrientation()) {
                case 0:
                    for (int i = b; i < b + c; i++)
                        this.battleField[a][i] = this.ship;
                    break;
                case 1:
                    for (int i = a; i < a + c; i++)
                        this.battleField[i][b] = this.ship;
                    break;
            }
        }
    }

    public String[][] getBattleField() {
        return battleField;
    }

    public BattleField fillField() {
        for (String[] value : battleField) {
            Arrays.fill(value, space);
        }

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                battleField[0][0] = " ";
                battleField[0][1] = " 1";
                battleField[0][2] = " 2";
                battleField[0][3] = " 3";
                battleField[0][4] = " 4";
                battleField[0][5] = " 5";
                battleField[0][6] = " 6";
                battleField[0][7] = " 7";
                battleField[0][8] = " 8";
                battleField[0][9] = " 9";
                battleField[0][10] = " 10";
                battleField[1][0] = " 1";
                battleField[2][0] = " 2";
                battleField[3][0] = " 3";
                battleField[4][0] = " 4";
                battleField[5][0] = " 5";
                battleField[6][0] = " 6";
                battleField[7][0] = " 7";
                battleField[8][0] = " 8";
                battleField[9][0] = " 9";
                battleField[10][0] = "10";
            }
        }
        return null;
    }

    public String getSpace() {
        return space;
    }
    public String getShip() {
        return ship;
    }
    public String getStrike() {
        return strike;
    }
    public String getMiss() {
        return miss;
    }

    public BattleField printField() {
        for (String[] strings : battleField) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        return null;
    }
}
