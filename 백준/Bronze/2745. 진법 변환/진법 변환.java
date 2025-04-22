import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();

        int result = 0;
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i) >= 'A'){
                result += (str.charAt(i) - 'A' + 10) * Math.pow(num, str.length()-1-i);
            }else{
                result += (str.charAt(i) - '0') * Math.pow(num, str.length()-1-i);
            }
        }

        System.out.println(result);
    }
}

