import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int row = 1;
        int column = 1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int num = sc.nextInt();
                if(max < num){
                    max = num;
                    row = i+1;
                    column = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
