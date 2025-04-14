import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int bucketN = sc.nextInt();
        int totalCount = sc.nextInt();
        int[] arr = new int[bucketN];

        int first = 0;
        int second = 0;
        int third = 0;
        for(int i=0; i<totalCount; i++){
            first = sc.nextInt();
            second = sc.nextInt();
            third = sc.nextInt();
            for(int j=first-1; j<second; j++){
                arr[j] = third;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        
    }
}
