import java.util.Scanner;
enum  Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class App{
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day = ");
        String input = scanner.next().toUpperCase();
        Day day = Day.valueOf(input);
        switch(day) {
            case MONDAY:
            System.out.println("Start of the week");
            break;

            case SATURDAY:
            case SUNDAY:
            System.out.println("ENJOY YOUR WEEKEND");
            break;

            default:
            System.out.println("IT'S A WEEKDAY");
        } 
    }
}