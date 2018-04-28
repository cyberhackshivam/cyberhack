import java.util.*;
class negativenumberexception extends Exeception
{
public static void main(String args[])
{
try 
{
int n;
Scanner sc=new Scanner(Syatem.in)
n=sc.nextInt();
if(n<=0)
{
throw  new negativenumberexception (" the number is negative or equal to zero");
}
catch(Exeception e)
{
System.out.println(e);
}
try
{
int a[n]=new a[n];;
for(int i=0;i<n;i++) throws NumberFormateException
{
Scanner sc=new Scanner(System.in);
a[n]=sc.nextInt();
}
catch(NumberFormateExeption e)
{
System.out.println(e + " " + " the value is not in the number formate");
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
double avg=sum/n;
System.out.println(" the avg of the number are " + " " + avg);
}
}



