import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = 0;
        int result = 0;
        for(int i=1; i<=num1; i++){
            if(num1 % i == 0){
                count++;
            }

            if(count == num2){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
