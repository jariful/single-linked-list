package regn_2041013280;
import java.util.*;

public class Studentmain 
{
   public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         SinglyLinkedList p=new SinglyLinkedList();
         while(true)
            {
               System.out.println("\n1 - Create New List"+"		2 - Display Output"+"		3 - Exit");			
                System.out.print("Enter a option : ");
                int input =sc.nextInt();
               switch(input)
                      {
	    case 1:
                             {	
                                  p.create();	
                                   break;
                             }
	    case 2:
                             {	
                                 p.display();
                                 p.findtopper();
                                p.DisplayFailedList();
                                 p.sort();
                                 break;
                             }
	    case 3:
                            {
                                 sc.close();
                                 System.out.println("\nEnding program . . ");
                                 System.exit(0);
                            }
                        default:
                                 System.out.println("Invalid Input");
	             break;
	   }	
                }
         }
  }
