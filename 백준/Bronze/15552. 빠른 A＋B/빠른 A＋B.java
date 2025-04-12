import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";
        try {
            while(str != null){
                if(str.trim().contains(" ")){
                    String[] arr = str.split(" ");
                    bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
                }
                str = br.readLine();
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
