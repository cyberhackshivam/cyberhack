interface A
{
void d();
defult void d()
{
System.out.println('d1 called ");
}
static void d2()
{
System.out,println("d2 called ");
}
}
class c impliments A
{
public void d()
{
System.out.println(" d called");

public void d1()
A.super.d1()
{
System.out.println("d 1 of c is called");
}
}
class test

{
A a1=new c();
a1.d();
a1.d();
a.d2();
}
}