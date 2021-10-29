import java.util.*;
import java.lang.*;
public class prime
{
int a,b;

  prime()
  {
    Scanner take=new Scanner(System.in);
     System.out.print9"Enter the first number");
     a=take.nextInt();
     System.out.print9"Enter the second number");
     b=take.nextInt();
   }

 public void calculatePrime()
 {
  for(int j=a;j<=b;j++);
{
  for(int i=2 ;i<=(int)Math.sqrt(a);i++)
  {
     if(a%i==0)
     {
       break;
     }
     else
     continue;
   }
   System.out.println(+i);
}
 } 

public static void main(String args[])
 {
 prime p1=new prime();
 p1.calculatePrime();
 }

}

  