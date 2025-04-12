import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        StringBuilder strb = new StringBuilder();
        
        for(int i=0; i<input/4; i++){
            strb.append(" long");
        }

        strb.append(" int");

        System.out.println(strb.toString().trim());
    }
}