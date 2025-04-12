import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int total = sc.nextInt();
        int count = sc.nextInt();

        for(int i=0; i<count*2; i++){
            arr.add(sc.nextInt());
        }
        
        int sum = 0;

        // 구매 물건의 종류의 갯수 맞으면 각각 곱해서 더하기
        if(count == arr.size() / 2){
            for(int i=1; i<arr.size(); i+=2){
                sum += arr.get(i-1) * arr.get(i);
            }
        }

        // 총 구매 가격이랑 같은지
        if(total == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
