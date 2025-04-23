import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        int resultCount = 0;

        for(int i=0; i<totalCount; i++){
            int num = sc.nextInt();

            int count = 0;
            for(int j=1; j<=num; j++){
                if(num % j == 0){
                    count ++;
                }                
            }

            if(count == 2){
                resultCount++;
            }
        }

        System.out.println(resultCount);
    }
}
