import java.util.*;
class odd extends Exception
{
odd(String s)
{
super(s);
}
}


class string
{

public static void main(String args[])
{
String a;
Scanner sc=new Scanner(System.in);
a=sc.next();
int b= a.length();
try
{

if ((b%2)!=0)
{
throw new odd(" string is no acceptable");
}
else 
{
System.out.println(" thanks for using this program");
}
}

catch(Exception e)
{
System.out.println(e);
}
}
}

