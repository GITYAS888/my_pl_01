public class app {
    public static void main(final String[] args) 
    {
        
        int number = 0;

        
        System.out.println("|number|number > 0|number < 10|number > 0 && number < 10|!(number > 0 && number < 10)|number > 0||number < 10|");

        
        for (int i = -1; i <= 10; i++)
         {
            number = i;
            System.out.println("|" + number + "|" + (number > 0) + "|" + (number < 10) + "|" + (number > 0 && number < 10) + "|" + !(number > 0 && number < 10) + "|" + (number > 0 || number < 10) + "|");
        }

        
    }
}