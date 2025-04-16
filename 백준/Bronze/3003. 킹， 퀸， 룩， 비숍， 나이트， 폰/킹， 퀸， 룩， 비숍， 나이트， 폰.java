import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<6; i++){
            int num = sc.nextInt();
            int count = 0;
            switch (i) {
                case 0:
                case 1:
                    if(num > 1){
                        while(num != 1){
                            num --;
                            count --;
                        }
                    }else if(num < 1){
                        count ++;
                    }
                    System.out.print(count + " ");
                    break;

                case 2:
                case 3:
                case 4: 
                    if(num > 2){
                        while(num != 2){
                            num --;
                            count --;
                        }
                    }else if(num < 2){
                        while(num != 2){
                            num ++;
                            count ++;
                        }
                    }
                    System.out.print(count + " ");
                    break;
            
                default:
                    if(num > 8){
                        while(num != 8){
                            num --;
                            count --;
                        }
                    }else if(num < 8){
                        while(num != 8){
                            num ++;
                            count ++;
                        }
                    }
                    System.out.print(count + " ");
                    break;
            }
        }
    }
}
