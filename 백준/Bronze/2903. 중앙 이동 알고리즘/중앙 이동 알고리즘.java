import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 3, 5, 9, 17, 33
        //  2   4   8  16 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int)Math.pow(Math.pow(2, num-1)+1 + Math.pow(2, num-1), 2));
    }
}
