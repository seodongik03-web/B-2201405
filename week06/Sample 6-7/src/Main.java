import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int gold = 849000;
        float weight;
        float don;
        long result;


        System.out.print("당신의 체중은 ? :");
        weight = keyboard.nextFloat();

        don = weight * 1000 / 3.75f;
        result = (long) (don * gold);


        System.out.printf("금 1돈(3.75g)의 가격은 %,d 원 입니다.\n",gold);
        System.out.printf("나의 체중은 %.1f kg(%.1f 돈)입니다\n",weight,don);
        System.out.printf("나의 몸값은 %,d원 입니다.\n",result);
    }
}