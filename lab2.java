import java.util.*;
import java.lang.*;
public class lab2{
int num;
lab2()
{
 Scanner take=new Scanner(System.in);
 System.out.print("Enter the number of rows");
 num=take.nextInt();
}
public void calculatePattern()
{
 int i=1;
 int count =1;
 for(i=1;i<=num;i++)
 {
   for(int j=1;j<=i;j++)
   {
   System.out.print(+count+" ");
   count++;
   }
   System.out.println();
  }
} 
public static void main(String args[]){
 lab2 p1=new lab2();
 p1.calculatePattern();
}
}
  