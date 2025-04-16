import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        sc.nextLine();
        int count = totalCount;
        for(int i=0; i<totalCount; i++){
            String str = sc.nextLine();

            str = str.replaceAll("(.)\\1+", "$1");
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                
                String str2 = str.replaceFirst(ch+"", "");
                if(str2.indexOf(ch) != -1){
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
