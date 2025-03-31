import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int during = sc.nextInt();
        int sum = minute + during;
        if(sum >= 60){
            hour += sum / 60;
            minute = sum % 60;
        }else{
            minute += during;
        }

        if(hour >= 24){
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute);
    }
}
