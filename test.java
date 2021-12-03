import java.util.*;
public class test{
public static void main(String args[])
{
int t;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number of test cases :");
t=in.nextInt();
  while(t!=0)
{
  t--;
  Book b1=new Book();
  System.out.println(b1);
}
}     
}
class Book{
 String name,aurthor;
 int price,num_pages;

  Book(){
   Scanner take =new Scanner(System.in);
   System.out.print("Enter the name of the book: ");
   name=take.nextLine();
   System.out.print("Enter the name of the author: ");
   aurthor=take.nextLine();
   System.out.print("Enter the price of the book: ");
   price=take.nextInt();
   System.out.print("Enter the number of pages of the book: ");
   num_pages=take.nextInt();
  }
  public String toString()
  {
     return "name: "+name+" "+"aurthor: "+aurthor+" "+"price: "+price+" "+"num_pages: "+num_pages;
  }
}






/*Create a class
Book which contains four members: name, author, price, num_pages. Include a
constructor to set the values for the members. Include methods to set and get
the details of the objects. Include a toString( ) method that could display
the complete details of the book. Develop a Java program to create n book
objects.*/

import java.util.*;
public class Main{
public static void main(String args[])
{
int t;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number of books:");
t=in.nextInt();
  Book b[]=new int[t];
  for(int i=0;i<t;i++)
  {
      b[i]=new Book();
    b[i].get();
  }
  for(int i=0;i<t;i++)
  {
    System.out.println(b[i]);
    }
}     
}
class Book{
 String name,aurthor;
 int price,num_pages;

  Book(){
      String name=0,aurthor=0;
 int price=0,num_pages=0;
   
  }
  void get()
  {
   Scanner take =new Scanner(System.in);
   System.out.print("Enter the name of the book: ");
   name=take.nextLine();
   System.out.print("Enter the name of the author: ");
   aurthor=take.nextLine();
   System.out.print("Enter the price of the book: ");
   price=take.nextInt();
   System.out.print("Enter the number of pages of the book: ");
   num_pages=take.nextInt();
  }
  public String toString()
  {
     return "name: "+name+" "+"aurthor: "+aurthor+" "+"price: "+price+" "+"num_pages: "+num_pages;
  }
}





