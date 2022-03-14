import java.util.*;
class fatherAgeException extends Exception
{
    public String toString()
    {
        return("Father age is less than zero");
    }
    
}
class sonAgeException extends Exception
{
    int age;
    sonAgeException(int a)
    {
        age=a;
    }
    public String toString()
    {
    if(age<=0)
    {
        return("Age cant be zero");
    }
    else
    {
        return("Sons age greater than father");
    }
}}
class father 
{
    int a;
    father()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter fathers age:");
    a=sc.nextInt();
    }
    void ex1() throws fatherAgeException
    {
        if(a<=0)
        {
            throw new fatherAgeException();
        }
    }
    
}
class son extends father
{
    int b;
    son()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter sons age:");
          b=sc.nextInt();
    }
    void ex2() throws sonAgeException
    {
        if(b<=0 || b>=super.a)
        {
            throw new sonAgeException(b);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	   son s=new son();
	   try{
	       s.ex1();
	   }
	   catch(fatherAgeException e)
	   {
	       System.out.println(e);
	   }
	   try{
	       s.ex2();
	   }
	   catch(sonAgeException e)
	   {
	       System.out.println(e);
	   }
	}
}
