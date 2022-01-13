//Exception handling program
import java.util.*;
class WrongAge extends Exception{
    public WrongAge(String a)
    {
        System.out.println(a);
    }
    
}
    
class Father
{
int age;
    Father()
    {

        Scanner t=new Scanner(System.in);
        System.out.print("Enter the age of father:");
         age=t.nextInt();
         try {
   if(age <0) 
    throw new WrongAge("Age cant be zero");
   else
    System.out.println("Valid age");
  }
  catch (WrongAge a) {

  }
    }
}
 class Son extends Father
{
    Son()
    {
     Scanner t=new Scanner(System.in);
        System.out.print("Enter the age of son:");
        int ageofson=t.nextInt();
         try {
   if(ageofson <=age && ageofson>0) 
    System.out.println("Valid age");
   else
    throw new WrongAge("Invalid son's age");
  }
  catch (WrongAge a) {
  }
}
}
public class programeight
{
	public static void main(String[] args) {
		Son s=new Son();
	}
}
