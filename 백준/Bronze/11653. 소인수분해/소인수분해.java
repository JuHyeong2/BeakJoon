import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i=2; i<=num; i++){
            if(num % i == 0){
                intArr.add(i);
                num = num / i;
                i--;
            }
        }

        for(int i : intArr){
            System.out.println(i);
        }
    }
}
