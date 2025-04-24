import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minusx = w-x;
        int minusy = h-y;

        if(minusx > minusy){
            if(minusy > y){
                if(x > y){
                    System.out.println(y);
                }else{
                    System.out.println(x);
                }
            }else{
                if(x > minusy){
                    System.out.println(minusy);
                }else{
                    System.out.println(x);
                }
            }
        }else{
            if(minusx > x){
                if(x > y){
                    System.out.println(y);
                }else{
                    System.out.println(x);
                }
            }else{
                if(y > minusx){
                    System.out.println(minusx);
                }else{
                    System.out.println(y);
                }
            }
        }
    }
}
