import java.util.Scanner;

public class App{
    public static void main(final String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your test score (0-100):");
        int testscore = scanner.nextInt();
        if (testscore >= 90){
            System.out.println("Excellent");
        }else if (testscore >= 70 && testscore <= 89){
            System.out.println("Good Job");
        }else if (testscore >50 && testscore <= 69){
            System.out.println("Needs Improvement");
        }else {
            System.out.println("Fail");
        }

        
    }
}