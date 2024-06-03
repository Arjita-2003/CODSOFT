import java.util.*;
public class random_number {
    public static void main(String args[])
    {
        Random rand = new Random();
   
        // Generate random integers in range 0 to 100
        int random = rand.nextInt(100);

        System.out.println("**********WELCOME*********");
        System.out.println();
        System.out.println();
        System.out.println("NUMBER GAME");
        System.out.println();
        System.out.println("Guess a number between 0 and 100");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
                int n = sc.nextInt();
                if(n == random){
                    System.out.println("WOAH!!! You are right");
                    break;
                }
                else if(n<random && i<4){
                    System.out.println("Oops! Try a higher number");
                }
                else if(n>random && i<4){
                    System.out.println("Oops! Try a lower number");
                }
                else if(i==4){
                    System.out.println("Sorry :( You are out of tries...");
                    System.out.println("The number was "+ random);
                }
     
        }
        
    }
}
