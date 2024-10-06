import java.util.Scanner;

public class App {
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int score;

        while (true){
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();

            if (score == -1) {
                break;
                
            }
            total += score;
            count++;

            if (count > 0) {
                System.out.printf("Average:%.2f%n" , total/ (double)count);   
            }
        }
        System.out.println("summary");
        System.out.println("************");
        System.out.println("Tests:" + count);
        if (count > 0 ) {
            System.out.printf("Average: %.2f%n" , total/ (double)count);
            
        } else {
            System.out.println("Average: N/A");
        }
        

        scanner.close();

    }
}