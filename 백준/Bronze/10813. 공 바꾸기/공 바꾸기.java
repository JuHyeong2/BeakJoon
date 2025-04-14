import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bucketN = sc.nextInt();
        int totalCount = sc.nextInt();

        int[] arr = new int[bucketN];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        
        for(int i=0; i<totalCount; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int temp = 0;

            temp = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = temp;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
