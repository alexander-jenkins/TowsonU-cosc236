/*
 * Class notes 2/19/20
 * The printf method
 */
public class ClassNotes0219{
    public static void main(String[] args){
        double grossPay = 874.12;
        // does not include a new line. must add one yourself
        System.out.printf("Your pay is %f.\n", grossPay);
        
        int dogs = 2, cats = 4;
        System.out.printf("I have %d cats and %d dogs!\n", cats, dogs);
        
        // how to round off numbers
        double bigNumber = 436.123469;
        System.out.printf("I have %.2f pounds of cat food.\n", bigNumber);
    }
}