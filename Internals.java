package Demo;
import java.util.*;
public class Internals
{
 public void takeinput(){
 int marks[]=new int[5];
 Scanner take=new Scanner(System.in);
 for(int i=0;i<5;i++)
  { 
     System.out.print("Enter the marks of subject no."+i);
     marks[i]=take.nextInt();
   }
  }
}