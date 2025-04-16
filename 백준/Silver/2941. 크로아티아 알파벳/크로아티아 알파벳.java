import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // String str2 = str.replaceFirst("c=", "");
        // System.out.println(str2);

        int count = 0;
        while (true) {
            if(str.contains("c=")){
                str = str.replaceFirst("c=", " ");
                count++;
            }else if(str.contains("c-")){
                str = str.replaceFirst("c-", " ");
                count++;
            }else if(str.contains("dz=")){
                str = str.replaceFirst("dz=", " ");
                count++;
            }else if(str.contains("d-")){
                str = str.replaceFirst("d-", " ");
                count++;
            }else if(str.contains("lj")){
                str = str.replaceFirst("lj", " ");
                count++;
            }else if(str.contains("nj")){
                str = str.replaceFirst("nj", " ");
                count++;
            }else if(str.contains("s=")){
                str = str.replaceFirst("s=", " ");
                count++;
            }else if(str.contains("z=")){
                str = str.replaceFirst("z=", " ");
                count++;
            }else{
                break;
            }
        }
        str = str.replace(" ", "");
        System.out.println(count + str.length());
    }
}
