import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Is it weekend? (True/False):");
        boolean isweekend = scanner.nextBoolean();
        if((age >= 18 && age <=65) && !isweekend){
            System.out.println(" YOU GET DISCOUNT");
        } else {
            System.out.println(" NO DISCOUNT FOR YOU SORRY!");
        }
    }
} 


