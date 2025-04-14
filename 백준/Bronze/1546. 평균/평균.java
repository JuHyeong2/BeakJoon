import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalCount = sc.nextInt();
        int[] arr = new int[totalCount];

        int max = 0;
        for(int i=0; i<totalCount; i++){
            arr[i] = sc.nextInt();
            
            if(max < arr[i]){
                max = arr[i];
            }
        }

        double newNum = 0;
        for(int i=0; i<arr.length; i++){
            newNum += (double)arr[i] / max * 100;
        }

        System.out.println(newNum/arr.length);

        
        
    }
}
