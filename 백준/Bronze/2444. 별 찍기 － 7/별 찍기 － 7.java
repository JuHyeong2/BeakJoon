import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=num-i-1; j>0; j--){
                System.out.print(" ");
            }

            for(int j=0; j<i*2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-2; i>=0; i--){
            for(int j=0; j<num-i-1; j++){
                System.out.print(" ");
            }

            for(int j=i*2+1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
