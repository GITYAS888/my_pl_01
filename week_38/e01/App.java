import java.util.Scanner;

public class App { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is your age = ");
        int age = scanner.nextInt();
        if (age >=18){
            System.out.println("You are eligible for voting");
        } else{
            System.out.println("You are not eligible for voting Sorry!");
        }
        
    }
}
