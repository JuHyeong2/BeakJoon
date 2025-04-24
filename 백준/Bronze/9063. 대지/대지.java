import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        
        // int[] intArrX = new int[totalCount];
        ArrayList<Integer> intArrX = new ArrayList<Integer>();
        ArrayList<Integer> intArrY = new ArrayList<Integer>();
        // int[] intArrY = new int[totalCount];
        for(int i=1; i<=totalCount*2; i++){
            if(i % 2 == 1){
                intArrX.add(sc.nextInt());
            }else{
                intArrY.add(sc.nextInt());
            }
        }

        Collections.sort(intArrX);
        Collections.sort(intArrY);

        System.out.println((intArrX.get(totalCount-1) - intArrX.get(0)) * (intArrY.get(totalCount-1) - intArrY.get(0)));


    }
}
