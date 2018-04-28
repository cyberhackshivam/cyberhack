abstract class A
{
int x=10;
void demo()
{ 
System.out.println(" i am from abstract class demo"+" "+ x);
}
}
interface B 
{
double x=20;
default void demo()
{
System.out.println(" i am from interface B demo" +" "+x);
}
}
class test extends A implements B
{
public void demo()
{
B.super.demo();
super.demo();

System.out.println("i am test class ");
}
public static void main(String args[])
{
 test t=new test();
t.demo();
}
}




