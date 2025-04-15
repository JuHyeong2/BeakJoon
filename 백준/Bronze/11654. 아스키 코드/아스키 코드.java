import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            System.out.println(System.in.read());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
