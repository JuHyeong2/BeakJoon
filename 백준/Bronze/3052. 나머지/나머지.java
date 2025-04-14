import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // 나머지 값을 배열에 저장
        for(int i=0; i<10; i++){
            arr.add(sc.nextInt() % 42);
        }

        // 값이 같으면 삭제
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    arr.remove(j);
                    // 삭제되면 인덱스가 하나씩 밀리기때문에 --해줌
                    j--;
                }
            }
        }
        System.out.println(arr.size());
    }
}
