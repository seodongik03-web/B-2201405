//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    final int year =365; // 1년
    final int speed = 300000; // 빛이 1초에 가는 거리(km)
    int second;
    long result;


    second = year * 24 * 60 * 60;
    result = (long) second * speed;


        System.out.printf("빛은 1초에 %,d km를 이동합니다.\n",speed);
        System.out.printf("%d일은 %,d초 입니다\n",year,second);
        System.out.printf("빛이 %d일 동안 이동한 거리는 %,d km 입니다.\n",year,result);

    }
}