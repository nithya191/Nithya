import java.io.*;
import java.util.*;
class First extends Thread
{
    public void run()
    {
        int i=0;
        try
        {
            while(i<10)
            {
                System.out.println("Good Morning ");
                i++;
                Thread.sleep(1000);
            }
        }
        catch(Exception e3){}
    }
}

class Second extends Thread
{
    public void run()
    {
        int j=0;
           try
        {
            while(j<10)
            {
                System.out.println("Hello ");
                j++;
                Thread.sleep(2000);
            }
        }
        catch(Exception e2){}
    }
}

class Third extends Thread
{
    public void run()
    {
        int k=0;
           try
        {
            while(k<10)
            {
                System.out.println("Welcome ");
                k++;
                Thread.sleep(3000);
            }
        }
        catch(Exception e1){}
    }
}
class TestClass
{
    public static void main(String args[])
    {
        try
        {
            First f=new First();
            f.start();
            Second s=new Second();
            s.start();
            Third t=new Third();
            t.start();
        }
        catch(Exception e){}
    }
}