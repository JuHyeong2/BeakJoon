import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        
        for(int i=0; i<totalCount; i++){
            int num = sc.nextInt();
            String str = sc.nextLine().trim();
            for(int j=0; j<str.length(); j++){
                for(int k=0; k<num; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
