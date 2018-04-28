import java.util.*;
class negativeage extends Exception
{
negativeage(String s)
{
super(s);
}
}


class age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
try
{

if (a<0)
{
throw new negativeage(" negative age is no acceptable");
}
else 
{
System.out.println(" age is correct");
}
}

catch(Exception e)
{
System.out.println(e);
}
}
}

