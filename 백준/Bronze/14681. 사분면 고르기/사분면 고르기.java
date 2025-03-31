import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numX = sc.nextInt();
        int numY = sc.nextInt();
        int answer = 0;

        if(numX > 0){
            if(numY > 0){
                answer = 1;
            }else{
                answer = 4;
            }
        }else{
            if(numY > 0){
                answer = 2;
            }else{
                answer = 3;
            }
        }

        System.out.println(answer);
    }
}
