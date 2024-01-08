import java.util.Arrays;
import java.util.Scanner;

public class ValidEnter {

    private int[] coord;
    private String[] n;


    public boolean validationEnter() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        n = s.split(",");
        try {
            Integer.parseInt(n[0]);
            Integer.parseInt(n[1]);
            Integer.parseInt(n[2]);
            Integer.parseInt(n[3]);
        } catch (NumberFormatException ex) {
            System.out.println("Пиши цифры! Балда!");
            return false;
        }
        return true;
    }

    public boolean stringToInt() {
        try {
            coord = Arrays.stream(n)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException ex) {

            return false;
        }
        return true;
    }

    public boolean vaEn() {
        if (coord.length != 4) {
            System.out.println("Четыре числа должно быть.");
            return false;
        }
        if (coord[0] > 10 || coord[0] < 0 || coord[1] > 10 || coord[1] < 0) {
            System.out.println("Числа от 1 до 10.");
            return false;
        }
        if (coord[3] != 0 && coord[3] != 1) {
            System.out.println("0 горизонально, 1 вертикально");
            return false;
        }
        return true;
    }
}
