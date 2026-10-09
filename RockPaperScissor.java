/**
 Jashan
 */
import java.util.Scanner;
public class RockPaperScissor
{
    public static void main(String[] args)
    { 
    Scanner kb = new Scanner (System.in);
    System.out.println("Let's play rock , paper and Scissor JC - choose one ._. ");
    String myThrow = kb.nextLine();
    System.out.println("Let's play rock , paper and Scissor Jack - choose one ._. ");
    String JackThrow = kb.nextLine();
    if ( myThrow.equalsIgnoreCase("Paper"))
    {
     
        if (JackThrow.equalsIgnoreCase("Scissor"))
        {
        System.out.println("You have won Jack");
        }
        else if (JackThrow.equalsIgnoreCase("Rock"))
        {
        System.out.println(" JC won ! ");
        }
        else 
        {
        System.out.println ( "Oops ! Tie - Paper , Try again");   
        }  
    }
    else if (myThrow.equalsIgnoreCase("Rock"))
    {
     
       if (JackThrow.equalsIgnoreCase("Scissor"))
       {
        System.out.println("JC won !");
        }
       else if (JackThrow.equalsIgnoreCase("Rock"))
       {
        System.out.println(" You have won Jack");
       }
       else 
       {
       System.out.println ( "Oops ! Tie - Rock , Try again");   
       }
    }
    else if (myThrow.equalsIgnoreCase("Scissor"))
    {
    
       if (JackThrow.equalsIgnoreCase("Scissor"))
       {
        System.out.println("Oops ! Tie - Scissor , Try again");
        }
       else if (JackThrow.equalsIgnoreCase("Rock"))
       {
        System.out.println(" You have won Jack !");
       }
       else 
       {
       System.out.println ( "JC won !");   
       } 
    }
    }
    }
