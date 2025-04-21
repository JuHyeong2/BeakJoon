import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 문자열로 입력을 받는다.
        // 제일 긴 문자열의 길이를 구한다.

        String[] strArr = new String[5];
        int maxLength = 0;
        for(int i=0; i<strArr.length; i++){
           strArr[i] = sc.nextLine();
           if(maxLength < strArr[i].length()){
               maxLength = strArr[i].length();
           }
        }

        for(int j=0; j<strArr.length; j++){
            int length = strArr[j].length();
            if(length < maxLength){
                for(int i=0; i<maxLength - length; i++){
                    strArr[j] += " ";
                }
            }
        }

        for(int i=0; i<maxLength; i++){
            for(int j=0; j<strArr.length; j++){
                if(strArr[j].charAt(i) != ' '){
                    System.out.print(strArr[j].charAt(i));
                }
            }
        }
    }
}
