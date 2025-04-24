import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            if(num1 == 0 && num2 == 0 && num3 == 0){
                break;
            }

            int max = 0;
            int sum = 0;
            if(num1 > num2){
                if(num1 > num3){
                    max = num1;
                    sum = num2 + num3;
                }else{
                    max = num3;
                    sum = num2 + num1;
                }
            }else{
                if(num2 > num3){
                    max = num2;
                    sum = num1 + num3;
                }else{
                    max = num3;
                    sum = num2 + num1;
                }
            }

            if(max >= sum){
                System.out.println("Invalid");
            }else{
                if(num1 == num2 && num1 == num3 && num2 == num3){
                    System.out.println("Equilateral");
                }else if(num1 == num2 || num1 == num3 || num2 == num3){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene ");
                }
            }
        }
    }
}
