import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1, 3, 6
        // 3 + 2 + 1

        long sum = 0;
        for(int i=1; i<N; i++){
            sum += i;
        }

        System.out.println(sum);
        System.out.println(2);
    }
}
