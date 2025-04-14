import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bucketN = sc.nextInt();
        int totalCount = sc.nextInt();
        int[] arr = new int[bucketN];

        for(int i=0; i<bucketN; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<totalCount; i++){
            int first = sc.nextInt() - 1;
            int last = sc.nextInt() - 1;
            int temp = 0;
            // for(int j=first-1; j<last; j++){
                
            // }

            while(first < last){
                temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first ++;
                last --;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
