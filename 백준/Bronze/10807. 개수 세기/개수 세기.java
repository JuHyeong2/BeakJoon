import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 입력받은 정수 갯수
        int totalCount = sc.nextInt();

        // 정수 갯수만큼 입력받기
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<totalCount; i++){
            arr.add(sc.nextInt());
        }

        // 특정값 입력받기
        int answer = sc.nextInt();

        int answerCount = 0;
        for(int i : arr){
            if(i == answer){
                answerCount++;
            }
        }

        System.out.println(answerCount);
    }
}
