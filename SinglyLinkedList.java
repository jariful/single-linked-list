package regn_2041013280;
import java.util.*;
public class SinglyLinkedList {
Node start=null;
	Scanner sc=new Scanner(System.in);	
	void create()
	{
		Student s1=new Student();Node n=new Node();
		System.out.println("\nEnter details for first node");
		s1.setStudentDetails();n.stud=s1;start=n;n.link=null;	Node last=start;		
		System.out.println("Do you want to add more nodes?(y/n)");
		char ch=sc.next().charAt(0);		
		while(ch== 'y' || ch=='Y')
		{
			n=new Node();	s1=new Student();s1.setStudentDetails();
			n.stud=s1;n.link=null;last.link=n;last=n;			
			System.out.println("\nDo you want to add more nodes?(y/n)");
			ch=sc.next().charAt(0);
		}
	}	
	void display()
	{
		if(start==null)
		{
			System.out.println("List is empty");return;
		}else{
			System.out.println("\nStudents results are :");
			Node t=start;
			while(t!=null)
			{
				t.stud.displayStudent();	System.out.println();	t=t.link;
			}
		}
	}
	void displaysort()
	{
		if(start==null)
		{
			System.out.println("List is empty");return;
		}else{
			System.out.println("\nThe sorted list is");
			System.out.print("Name		Roll			Mark\n");
			Node t=start;
			while(t!=null)
			{
				t.stud.displayStudentSort(); t=t.link;
			}
		}
	}
	void sort()
	{
		if(start==null)
		{
			System.out.println("\nList is empty\n\n");return;
		}else{
			double t = 0;String q = null;int r = 0;				
			for(Node i=start;i.link!=null;i=i.link)
			{
				for(Node j=i.link; j!=null; j=j.link)
				{					
					if(j.stud.mark > i.stud.mark )
					{						
					    t=i.stud.mark;i.stud.mark= j.stud.mark;	j.stud.mark=t;
					    q=i.stud.name;i.stud.name=j.stud.name;j.stud.name=q;						
						r=i.stud.roll;i.stud.roll=j.stud.roll;j.stud.roll=r;						
					}
				}
			}
			displaysort();			
		}
	}		 
	void findtopper()
	{	
		if(start==null)	{
			System.out.println("\nlist is empty. Make atleast one node.\n\n");
			return;	
		}else	{
			Node t=start;double large=0;		    
	    	while(t.link!=null)
		    {
	            if(large < t.stud.mark )
	            {	            	
		           	large= t.stud.mark;		           
	            }
	            t=t.link;
	        }	    	
	    	Node m=start;	    	
	    	while(m.link!=null)
	    	{
	    		if(large==m.stud.mark)	{
	    			System.out.println("\n\nThe topper is "+m.stud.name
	    					+"has secured "+m.stud.mark+"marks \nhaving roll number"+m.stud.roll);}
	            m=m.link;
		    }
	     }
	}	
	void DisplayFailedList()
	{		
		if(start==null)
		{
			System.out.println("\nlist is empty. Make atleast one node.\n\n");
			return;
		}else	{
			Node t=start;
	    	while(t!=null)
		    {
	            if(t.stud.mark < 40 ){	                
	                System.out.println("\nThe failed Students are :\n");
	    			System.out.println(t.stud.name+"	"+t.stud.roll+"	"+t.stud.mark);}
	            t=t.link;
	        }           
		}
	}
}
