/*program to create a class Student with members usn, name, an array credits
and an array marks. Include methods to accept and display details and a
method to calculate SGPA of a student. usn, name, an array credits*/
import java.util.*;
public class lab2{
    public static void main(String args[])
    {
        Student s=new Student();
        s.accept();
        s.calculate();
        s.display();
    }
}
class Student{
    String usn,name;
    int []credits,marks,grade;
    double SGPA=0;
    int sub;
    void accept()
    {
        
        Scanner take=new Scanner(System.in);
        System.out.print("Enter the USN :");
        usn=take.nextLine();
        System.out.print("Enter the name :");
        name=take.nextLine();
        System.out.print("Enter the no. of subjects:");
        sub=take.nextInt();
        credits=new int[sub];
        marks=new int[sub];
        grade=new int[sub];
        for(int i=0;i<sub;i++)
        {
            System.out.print("Enter the marks of subject no "+(i+1)+" :");
            marks[i]=take.nextInt();
             System.out.print("Enter the credits of subject no "+(i+1)+" :");
            credits[i]=take.nextInt();
            
            
        }
        
    }
    void calculate()
    {
        int sumcreds=0,sum=0;
        for(int i=0;i<sub;i++)
        {
            if(marks[i]>=90)
            {
                   grade[i]=10;
            }
         
            else if(marks[i]>=80)
            grade[i]=9;
            else if(marks[i]>=70)
            grade[i]=8;
            else if(marks[i]>=60)
            grade[i]=7;
            else if(marks[i]>=50)
            grade[i]=6;
            else if(marks[i]>=40)
            grade[i]=5;
            else
            grade[i]=0;
        }
        for(int k=0;k<sub;k++)
        {
            sumcreds=sumcreds+credits[k];
        }
        for(int j=0;j<sub;j++)
        {
            sum=sum+(grade[j]*credits[j]);
        }
        SGPA=sum/sumcreds;
    }
    void display()
    {
        System.out.println("USN :"+usn);
        System.out.println("Name :"+name);
        for(int i=0;i<sub;i++)
        System.out.println("Marks of "+(i+1)+" subject is :"+marks[i]);
        System.out.println("Sgpa :"+SGPA);
    }
    
}
