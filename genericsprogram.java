import java.util.*;
 class genericcs<T,V>
{
    T ob1;
    V ob2;
    genericcs(T o, V o1)
    {
        ob1=o;
        ob2=o1;
    }
    void show()
    {
        System.out.println("Type of first:"+ob1.getClass().getName());
        System.out.println("Type of second:"+ob2.getClass().getName());
        
    }
    T get()
    {
        return ob1;
    }
    V get1()
    {
        return ob2;
    }
}
public class genericsprogram
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String a;
		int b;
		double c;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string and then integer");
		a=sc.nextLine();
		b=sc.nextInt();
		System.out.println("Enter double and then string");
		c=sc.nextDouble();
		sc.nextLine();
		d=sc.nextLine();
		 genericcs<String,Integer>firstobject=new genericcs<String,Integer>(a,b);
		 firstobject.show();
		 String str1=firstobject.get();
		 int num1=firstobject.get1();
		 System.out.println("First one:"+str1);
		 System.out.println("First one:"+num1);
		 genericcs<Double,String> secondobject=new genericcs<Double,String>(c,d);
		 secondobject.show();
		 double num2=secondobject.get();
		 String str2=secondobject.get1();
		 System.out.println("Second one:"+num2);
		 System.out.println("Second one:"+str2);
		 
	}
}
