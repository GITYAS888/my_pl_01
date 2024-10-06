public class App {
    public static void main(final String[] args) {
        int rows = 6; 
        for (int i = 1; i <= rows; i++) {
           
            for (int j = i; j < rows; j++) {
                System.out.print(" "); 
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(i); 
            }
           
            System.out.println(); 
        }
    }
}