import java.util.Scanner;

public class App{
    public static void main(final String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Which multiplication table do you want = ");
        int number = scanner.nextInt();
        for (int i = 0; i<=10; i++ ) {
            System.out.println( i + " * " + number + "=" + (i * number ));
        }
    }
}


















