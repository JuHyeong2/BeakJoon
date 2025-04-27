import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> intArr = new ArrayList<Integer>(); 
        for(int i=0; i<N; i++){
            intArr.add(sc.nextInt());
        }

        Collections.sort(intArr);
        // System.out.println(intArr);

        int sum = 0;
        int count = 0;
        ArrayList<Integer> sumArr = new ArrayList<Integer>();
        ArrayList<Integer> countArr = new ArrayList<Integer>();
        loop1: 
        for(int i=0; i<intArr.size()-2; i++){
            for(int j=i+1; j<intArr.size()-1; j++){
                for(int k=j+1; k<intArr.size(); k++){
                    count = 0;
                    sum = intArr.get(i) + intArr.get(j) + intArr.get(k);

                    if(sum > M){
                        break;
                    }

                    sumArr.add(sum);

                    if(sum == M){
                        System.out.println(sum);
                        count = -1;
                        break loop1;
                    }
                    
                    if(sum < M){
                        count = M - sum;
                        countArr.add(count);
                    }
                }
            }
        }

        // System.out.println(countArr.toString());
        // System.out.println(sumArr.toString());

        if(count != -1){
            int min = Collections.min(countArr);
            int index = countArr.indexOf(min);
            System.out.println(sumArr.get(index));
        }

    }
}
