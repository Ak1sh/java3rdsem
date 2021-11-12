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


