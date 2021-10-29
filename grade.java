import java.util.*;
import java.lang.*;
public class grade{
int num=0;
int sum=0;
public void input(int max)
{
 Scanner take=new Scanner(System.in);
 
 while(true){
 num=take.nextInt();
   if(num>=0 && num<=max)
  {
    if(max==100)
     {
        num=num/2;  
        sum+=num;
        break;
      }
     else
     {
        sum+=num;
        break;
      }
   }     
  else
  {
     System.out.println("Enter a valid marks");
  }
 }
}

public void calculateGrade()
{
  if(sum>=90 &&sum<=100)
   System.out.println("The grade is S");
  else if(sum>=80 && sum<=89)
   System.out.println("The grade is A");
  else if(sum>=70 && sum<=79)
   System.out.println("The grade is B");
  else if(sum>=60 &&sum<=69)
   System.out.println("The grade is C");
  else if(sum>=50 &&sum<=59)
   System.out.println("The grade is D");
  else if(sum<=49)
   System.out.println("The grade is F");
} 
public static void main(String args[]){
 
 grade p1=new grade();
 System.out.print("Enter the number of subjects");
 Scanner in=new Scanner(System.in);
 int numberOfSubjects=in.nextInt();
 for(int i=1;i<=numberOfSubjects;i++)
{
 System.out.print("Enter the cie marks:");
 p1.input(50);
 System.out.print("Enter the see marks:");
 p1.input(100);
 p1.calculateGrade();
 }
}
}

  