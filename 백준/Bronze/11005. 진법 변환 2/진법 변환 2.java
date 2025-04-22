import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int mod = 0;
        StringBuilder sb = new StringBuilder();
        while(num >= num2){
            mod = num % num2;
            num = num / num2;
            if(mod >= 10){
                sb.append((char)(mod + 'A' - 10));
            }else{
                sb.append(mod+"");
            }
        }

        if(num >= 10){
            sb.append((char)(num + 'A' - 10));
        }else{
            sb.append(num+"");
        }

        System.out.println(sb.reverse());
    }
}
