import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        // int sum = 0;
        // int count = 0;
        // while(sum < V){
        //     count++;
        //     sum += A;
        //     if(sum >= V){
        //         break;
        //     }
        //     sum -= B;
        // }

        V = V - A;

        if(V%(A - B) == 0){
            System.out.println(V/(A - B) + 1);
        }else{
            System.out.println(V/(A - B) + 2);
        }

    }
}
