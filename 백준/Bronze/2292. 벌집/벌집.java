import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 1, 7, 19, 37, 61
        //  6, 12, 18, 24
        // 6n + 1
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = 1;
        int count = 1;
        while(result < num){
            result += 6*count;
            count++;
        }

        System.out.println(count);
    }
}
