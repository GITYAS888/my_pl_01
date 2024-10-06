import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number(1-7) = ");
        int daynum = scanner.nextInt();
        switch (daynum) {
            case 1:
            System.out.println("MONDAY");
            break;

            case 2:
            System.out.println("TUESDAY");
            break;

            case 3:
            System.out.println("WEDNESDAY");
            break;

            case 4:
            System.out.println("THURSDAY");
            break;

            case 5:
            System.out.println("FRIDAY");
            break;

            case 6:
            System.out.println("SATURDAY");
            break;

            case 7:
            System.out.println("SUNDAY");
            break;

            default:
            System.out.println("INVALID NUMBER");
        }
        
    }
}
