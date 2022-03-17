 class multiThread implements Runnable
{
    String a;
    int time,numberoftimes;
   public multiThread (String x,int t,int n)
    {
        a=x;
        time=t;
        numberoftimes=n;
    }
    @Override
    public void run()
    {
        for(int i=0;i<numberoftimes;i++)
        {
        System.out.println(a);
        try{
        Thread.sleep(time);
        }
        catch(InterruptedException e){
        }
        }
    }
}
public class threads{
    public static void main(String[] args)
    {
           multiThread my= new multiThread("USN",1000,2);
           multiThread my1= new multiThread("cse",1000,2);
           multiThread my2= new multiThread("bmsce",1000,2);
           multiThread my3= new multiThread("banglore",1000,2);
           
           Thread newone1=new Thread(my1);
           Thread newone=new Thread(my);
           Thread newone2=new Thread(my2);
           Thread newone3=new Thread(my3);
           newone.start();
           newone1.start();
           newone2.start();
           newone3.start();
    }
}
