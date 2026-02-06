
public class EqualityOperators
{
    public static void main (String [] args) { 
        boolean isCorrect = false; 
        String cat = "Cat"; 
        String dog = "Cat"; 
        //1 way of determining equality 
        
        if ( 1==2) { 
            isCorrect = false; 
        } 
        
        if ( dog == cat) { 
            //isCorrect? doesnt matter.
        } 
        
        if(dog.equals(cat)){ 
            //YES
        } 
        
        if (1.2 == 1.2) { 
            //no u can not compare decimals inside of "==" operations 
        } 
        
        double sum = 0; 
        System.out.println("Sum" + sum); 
        for (int i = 0; i<10; i++) { 
            sum = sum+ .1; 
            
            System.out.println("Sum" + sum); 
            
        }
    }
}