import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=2; i>=0; i--){
            sb1.append(str1.charAt(i));
            sb2.append(str2.charAt(i));
        }

        if(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
            System.out.println(sb1);
        } else{
            System.out.println(sb2);
        }
    }
}
