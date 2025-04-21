import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();

        // int[][] xy = new int[2][totalCount];
        int[] x = new int[totalCount];
        int[] y = new int[totalCount];

        int result = 0;
        for(int i=0; i<totalCount; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[][] paper = new int[100][100];

        for(int i=0; i<totalCount; i++){
            for(int j=x[i]; j<x[i]+10; j++){
                for(int k=y[i]; k<y[i]+10; k++){
                    paper[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                // System.out.print(paper[i][j]);
                if(paper[i][j] == 1){
                    result += 1;
                }
            }
            // System.out.println();
        }

        System.out.println(result);
    }
}