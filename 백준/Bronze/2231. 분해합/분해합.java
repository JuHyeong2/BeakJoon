import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = true;
        for(int i=1; i<num; i++){
            String str = i+"";
            String[] strArr = str.split("");
            int sum = i;
            for(String s : strArr){
                sum += Integer.parseInt(s);
            }

            if(sum == num){
                flag = false;
                System.out.println(i);
                break;
            }
        }

        if(flag){
            System.out.println(0);
        }
    }
}
