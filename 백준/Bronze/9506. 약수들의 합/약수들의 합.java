import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
            if(num == -1){
                break;
            }

            ArrayList<Integer> numArr = new ArrayList<Integer>();
            int sum = 0;
            for(int i=1; i<num; i++){
                if(num % i == 0){
                    numArr.add(i);
                    sum += i;
                }
            }

            if(sum == num){
                System.out.print(num + " = ");
                for(int i=0; i<numArr.size(); i++){
                    if(i == numArr.size()-1){
                        System.out.print(numArr.get(i));
                        break;
                    }
                    System.out.print(numArr.get(i) + " + ");
                }
                System.out.println();
            }else{
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}
