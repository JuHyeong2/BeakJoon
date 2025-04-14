import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
                
        for(int i=1; i<29; i++){
            arr.add(sc.nextInt());
        }

        for(int i=1; i<31; i++){
            if(!arr.contains(i)){
                System.out.println(i);
            }
        }
    }
}
