import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = 0;
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i=num1; i<=num2; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }

            if(count == 2){
                sum += i;
                intArr.add(i);
            }
        }

        if(sum != 0){
            System.out.println(sum);
            System.out.println(intArr.get(0));
        }else{
            System.out.println(-1);
        }
        
    }
}
