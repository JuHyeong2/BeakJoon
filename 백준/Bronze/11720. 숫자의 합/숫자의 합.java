import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int result = 0;

        for(int i=0; i<totalCount; i++){
            result += Integer.parseInt(str.charAt(i)+"");
        }

        System.out.println(result);
    }    
}
