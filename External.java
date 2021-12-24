package SEE;

import java.util.*;
public class External {
public void seeinput()
{
 Scanner in=new Scanner(System.in); 
 int seeMarks[]=new int[5];
 for(int i=0;i<5;i++)
{
  System.out.print("Enter the marks of subject"+(i+1));
  seeMarks[i]=in.nextInt();
  }
}
}