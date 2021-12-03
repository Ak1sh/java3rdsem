import java.util.*;
public class lab1{
    public static void  main(String args[])
    {
        quad q=new quad();
        q.calculate();
    }
}
class quad{
int a,b,c,d;
double res,res1;
  quad()
{
 
 Scanner take=new Scanner(System.in);
 System.out.print("Enter the values of a ,b,c :");
 a=take.nextInt();
 b=take.nextInt();
 c=take.nextInt();

}

void calculate()
{
  d=b*b-(4*a*c);
  if(d<0)
  {
    System.out.println("No real solutions");
  }
  else if(d==0)
  {
    res=-b/(2*a);
    System.out.println("The roots are "+res+" ,"+res);
  }
  else
  {
      res=(-b+Math.sqrt(d))/(2*a);
      res1=(-b-Math.sqrt(d))/(2*a);
      System.out.println("The roots are "+res+" ,"+res1);
  }
}
}