import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        String[] arrStr = str.split(" ");
        
        int count = 0;
        for(String str2 : arrStr){
            if(!str2.equals(" ") && !str2.equals("")){
                count++;
            }
        }
        System.out.println(count);
    }
}
