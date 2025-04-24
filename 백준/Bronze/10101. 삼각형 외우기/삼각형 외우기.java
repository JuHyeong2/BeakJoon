import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int degree1 = sc.nextInt();
        int degree2 = sc.nextInt();
        int degree3 = sc.nextInt();

        int degreeSum = degree1 + degree2 + degree3;

        if(degreeSum == 180){
            if(degree1 == degree2 && degree1 == degree3){
                System.out.println("Equilateral");
            }else if(degree1 == degree2 || degree1 == degree3 || degree2 == degree3){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }
    }
}
