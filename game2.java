import java.util.Scanner;
import java.util.Random;

public class game2 {
    public static void main(String[] args) {
        Random rd = new Random();
         int comInput = rd.nextInt(100);
         boolean div = true;
         
         
         while (div) {
         Scanner sc = new Scanner(System.in);
         System.out.print(" guess the number---- ");
         int userInput=sc.nextInt();
         
         if(userInput==comInput){
            System.out.println("       ");
            System.out.println(userInput+" is the righ ans --you complited the game \n \n");
            div=false;
         }
           else if (userInput>comInput){
            System.out.println("\n"+userInput+" --your number is very high\n ");
     
         }
            else if (userInput<comInput){
            System.out.println("\n"+userInput+"  --your number is low\n ");
     
         }
      

         }
        
    }
}
