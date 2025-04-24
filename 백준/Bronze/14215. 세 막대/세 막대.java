import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i=0; i<3; i++){
            intArr.add(sc.nextInt());
        }

        Collections.sort(intArr);
        int max = intArr.get(2);
        int sum = intArr.get(0) + intArr.get(1);
        
        while(sum <= max){
            max --;
        }

        System.out.println(max + sum);
    }
}
