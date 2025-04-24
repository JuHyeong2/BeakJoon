import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int resultX = 0;
        int resultY = 0;
        if(x1 == x2){
            resultX = x3;
        }else if(x1 == x3){
            resultX = x2;
        }else{
            resultX = x1;
        }

        if(y1 == y2){
            resultY = y3;
        }else if(y1 == y3){
            resultY = y2;
        }else{
            resultY = y1;
        }

        System.out.println(resultX + " " + resultY);
    }
}
