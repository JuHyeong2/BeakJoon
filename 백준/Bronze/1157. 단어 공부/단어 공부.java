import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String upStr = str.toUpperCase();

        String[] arr = upStr.split("");
        ArrayList<String> arr2 = new ArrayList<>();

        for(String s : arr){
            arr2.add(s);
        }

        Set<String> set = new HashSet<>(arr2);
        ArrayList<Integer> valArr = new ArrayList<>();
        ArrayList<String> keyArr = new ArrayList<>();

        for(String s : set){
            // System.out.println(s + " : " + Collections.frequency(arr2, s));
            valArr.add(Collections.frequency(arr2, s));
            keyArr.add(s);
        }

        ArrayList<Integer> valArr2 = new ArrayList<>(valArr);
        Collections.sort(valArr);

        if(valArr.size() == 1){
            System.out.println(keyArr.get(0));
        }
        else if(valArr.get(valArr.size()-1).equals(valArr.get(valArr.size()-2)) || valArr.get(valArr.size()-1) == valArr.get(valArr.size()-2)) {
            System.out.println("?");
        }else{
            System.out.println(keyArr.get(valArr2.indexOf(valArr.get(valArr.size()-1))));
        }
    }
}
