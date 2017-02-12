
/*
 * @author (WOLF) 
 * @version (0.0, 12/23/2016)
 */
public class HelloWolf
{   
    public static void main(String[] args)
    {
        //char fullTum;
        //String stillHungry;
        boolean hungry = true;
        int rabbits = 3;
        String runRabbit = "\n (0) (0) \n (._._)(___#@#_)";
        
        System.out.println("Hello, Wolf.");
        
        while (hungry == true)
        {
            System.out.println("How many rabbits can you eat?: ");
            System.out.println(rabbitsEat);
            while (rabbits != 0)
            {
                System.out.print(runRabbit + "...");
                rabbits--;
                
            }
            if (rabbits == 0)
            {
                hungry = false;
            }

            
        }
            
            
    }        
            
            /*
        System.out.print("How many rabbits can you eat?");
        System.input.get(rabbits); //if (rabbits.get != null)
        while (rabbits != 0)
        {
            rabbits = rabbits--;
        }
        if (rabbits == 0)
        {
        System.out.print("All Full? Y/N: ");
        System.get(fullTum);
        fullTum = fullTum.toUpperCase();
        while(fullTum.contains("N")) //OR?
        {
            System.out.print("How many rabbits can you eat?");
            System.input.get(rabbits);
        }
    }
       
    
        
        System.out.println("Run, Rabbit");
    }
    */
}
