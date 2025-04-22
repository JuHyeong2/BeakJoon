import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 1/1, 1/2, 2/1, 3/1, 2/2, 1/3, 1/4, 2/3, 3/2
        // 1,    3,   6,   10,   15 == result
        // 1/1, 2/1, 1/3, 4/1, 1/5
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        int nan = 2;
        int count = 1;
        while(result < num){
            result += nan;
            nan ++;
            count ++; 
        }
        // System.out.println(result);
        // System.out.println(nan);
        // 짝수면 앞자리, 홀수면 뒷자리 (/기준)
        if(count % 2 == 0){
            int front = result + num - (int)Math.pow(count, 2);
            int back = result - num + 1;
            System.out.println(front + "/" + back);
        }else{
            int front = result - num + 1;
            int back = result + num - (int)Math.pow(count, 2);
            System.out.println(front + "/" + back);
        }

        // System.out.println(count);/
    }
}
