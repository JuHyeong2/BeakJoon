import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        Arrays.sort(strArr);
        // Collections 쓰기위해 변환
        List<String> list = Arrays.asList(strArr);

        int count = 0;
        int duplication = 0;
        for(int i=1; i <= 6; i++){
            count = Collections.frequency(list, i + "");
            if(count > 1){
                duplication = i;
                break;
            }
        }
        
        if(count == 3){
            System.out.println(duplication * 1000 + 10000);
        }else if(count == 2){
            System.out.println(duplication * 100 + 1000);
        }else{
            System.out.println(Integer.parseInt(list.get(2)) * 100);
        }
    }
}
