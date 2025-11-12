import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        final int LENGTH = 6;
        int[] lotto = new int[LENGTH];
        boolean flag = false;

        int i = 0;
        while (i < lotto.length) {
            flag = false;
            lotto[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                i++;
            }
        }

        System.out.print("Lotto :");
        for (i = 0; i < lotto.length; i++)
            System.out.printf("%2d,", lotto[i]);
        System.out.printf("\b\b");
    }
}
