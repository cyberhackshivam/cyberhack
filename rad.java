import java.util.*;
class negativeage extends Exception
{
negativeage(String s)
{
super(s);
}
}


class rad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
try
{

if (a<0)
{
throw new negativeage(" negative radius is no acceptable");
}
else 
{double c=2*3.14*a;
System.out.println(" circumfrance of circle  is " + " " + c);
}
}

catch(Exception e)
{
System.out.println(e);
}
}
}

