//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final float Year = 365.2422f;
        double temp;
        int day;
        int hour;
        int minute;
        int second;


        day = (int) Year;

        temp = Year - day;
        hour = (int) (temp *= 24);

        temp -= hour;
        minute = (int) (temp *= 60);

        temp -= minute;
        second = (int) ((temp *= 60) + 0.5);


        System.out.printf("1년은 %.4f인데 이것은\n"+
                "%d일 %d시간 %d분 %d초 입니다.\n",Year,day,hour,minute,second);


    }
}