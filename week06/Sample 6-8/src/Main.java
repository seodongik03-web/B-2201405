//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592f;
        final int radius = 6378137;    // m
        final int korea = 99720;   // ㎢
        double temp;
        long surface;
        double result;

        temp = 4 * PI * radius * radius;
        surface = (long) (temp /1000);

        result =  ((double) korea / surface) * 100.0f ;


        System.out.printf("지구의 반지름은 %,d m 입니다.\n",radius);
        System.out.printf("지구의 표면적은 %,d\u33A2 입니다.\n",surface);
        System.out.printf("대한민국의 넓이는 %,d\u33A2 입니다.\n",korea);
        System.out.printf("대한민국은 지구의 %.8f %% 입니다.\n",result);
    }
}