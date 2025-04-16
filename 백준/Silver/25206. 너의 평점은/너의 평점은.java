import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0;
        double scoreSum = 0.0;
        
        for(int i=0; i<20; i++){
            String sub = sc.next();
            double score = sc.nextDouble();
            double score2 = 0.0;
            String scoreStr = sc.next();

            switch (scoreStr) {
                case "A+": score2 = 4.5; break;
                case "A0": score2 = 4.0; break;
                case "B+": score2 = 3.5; break;
                case "B0": score2 = 3.0; break;
                case "C+": score2 = 2.5; break;
                case "C0": score2 = 2.0; break;
                case "D+": score2 = 1.5; break;
                case "D0": score2 = 1.0; break;
                case "F": score2 = 0.0; break;
                default: score2 = 0.0; score = 0.0; break;
            }
            totalScore += score * score2;
            scoreSum += score;
        }

        double avg = totalScore / scoreSum;
        System.out.println(avg);
    }
}
