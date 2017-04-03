import java.lang.String;
import java.lang.System;

class Overloading
{
     void add(int a,int b)
     {
      System.out.println("a+b");
     }
     void add(int a,int b,int c)
{
     System.out.println("a+b+c");
}
public static void main(String args[])
{
     Overloading a=new Overloading( );
      a.add(10,20);
      a.add(10,20,30);
}
}
