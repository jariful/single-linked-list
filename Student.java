package regn_2041013280;
import java.util.*;

public class Student 
{
  String name;	
    int roll;	
  double mark;		
void setStudentDetails() 
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("\nEnter the Name , roll number and mark of the student");	 
         name=sc.next();	
         roll=sc.nextInt();	
         mark=sc.nextDouble();
      }
void displayStudent() 
     {			
        System.out.println("Name of the student is " +name+ "\nRoll number of the student is " +roll+ "\nMark of the student is " +mark);
     }
void displayStudentSort() 
     {			
        System.out.println(name+"\t\t"+roll+"\t\t"+mark);
     }
}
