import java.util.Arrays;

public class BattleField {
    private String[][] battleField = new String[11][11];
    private String space = "⬜";



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
