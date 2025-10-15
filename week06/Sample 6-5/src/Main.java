import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int mps = 340;  // meter
        float fighter;
        float temp;
        int result;



        System.out.print("전투기의 스피드 입력 : ");
        fighter = keyboard.nextFloat();

        temp = fighter * 365 * 24 * 60 * 60 * mps ;
        result = (int) (temp / 1000);



        System.out.printf("마하 %.1f인 전투기에 1년간 간 거리는 %,d km 입니다 \n",fighter,result);



    }
}