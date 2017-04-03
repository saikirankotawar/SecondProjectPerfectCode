import java.lang.String;
import java.lang.System;
class OverRiding
{
	void m1( )
	{
		System.out.println("A( ) is implemented");
	}
}
class Over extends OverRiding
{
		void m1( )
	{
		System.out.println("A( ) is implemented by b");
	}

}
class Ty
{
public static void main(String[ ] args)
{
        Ty sai=new Ty( );
		sai.m1( );
}
}