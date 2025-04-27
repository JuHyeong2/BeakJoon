import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int ad = a*d;
        int bd = b*d;
        int cd = c*d;
        int ae = a*e;
        int af = a*f;

        // bd * y = cd;
        // ae * y = af;

        // (bd - ae) * y = cd - af;
        // y = (cd - af) / (bd - ae)

        if(bd - ae != 0 && a != 0){
            int y = (cd - af) / (bd - ae);
            int x = (c - b*y)/a;
            System.out.println(x + " " + y);
        }else if(a == 0){
            int y = c / b;
            int x = (f - e*y) / d;
            System.out.println(x + " " + y);
        }

        
    }
}

