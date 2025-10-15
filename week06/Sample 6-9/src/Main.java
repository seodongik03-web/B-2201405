import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int ciga = 7; // 분
        int year;
        int gapi;
        int result;
        int hour;
        int day;

        System.out.print("당신은 하루에 몇개피의 담배를 피우나요 ? :");
        gapi = keyboard.nextInt();
        System.out.print("당신은 몇년동안 담배를 피우나요 ? :");
        year = keyboard.nextInt();

        result = gapi * year * 365 * ciga ;
        hour = result /60;
        day = hour / 24;

        System.out.printf("담배 1개피는 수명을 %d분 단축합니다.\n",ciga);
        System.out.printf("담배를 %d년 동안 하루에 평균 %d개피를 피웠다.\n",year,gapi);
        System.out.printf("그러면 수명이 %,d분(%,d 시간,%,d일) 단축됩니다.\n",result,hour,day);
    }
}