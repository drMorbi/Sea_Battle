import java.util.Arrays;
import java.util.Scanner;

public class ValidEnter {

    private int[] coord;

    public void stringToInt() throws NumberFormatException{
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] n = s.split(",");

        try {
            coord = Arrays.stream(n)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }catch (NumberFormatException ex){
            System.out.println("Пиши числа, дурень!");
        }
    }

    public boolean vaEn(){
        if (coord.length != 3){
            System.out.println("Три числа должно быть.");
            return false;
        }
        if (coord[0] > 10 || coord[0] < 0 || coord[1] > 10 || coord[1] < 0 ){
            System.out.println("Числа от 1 до 10.");
            return false;
        }
        if (coord[2] != 0 && coord[2] != 1){
            System.out.println("0 горизонально, 1 вертикально");
            return false;
        }
        return true;
    }
}
