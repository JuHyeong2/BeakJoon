import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        long result = 0;
        for(String str2 : strArr){
            result += Long.parseLong(str2);
        }
        System.out.println(result);

    }
}
