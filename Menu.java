import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Menu
{
public static void main(String[] args)
{
System.out.println("-------------Menu-----------------");
System.out.println("----------------------------------------");
System.out.println("1.Idly");
System.out.println("2.Wada");
System.out.println("3.poori");
System.out.println("4.Dosa");
System.out.println("------------------------------------------");
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");
int choice=sc.nextInt( );
switch(choice)
{
case 1: System.out.println("you selected 1.Idly and is price is Rs.30"); break;
case 2: System.out.println("you selected 2.Wada and is price is Rs.40"); break;
case 3: System.out.println("you selected 1.Poori and is price is Rs.50"); break;
case 4: System.out.println("you selected 1.Dosa and is price is Rs.60"); break;
default: System.out.println("not available");
}
}
}