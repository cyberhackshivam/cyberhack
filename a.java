class A
{
static void d()
{
int a=50; 

int b=0;
int c= a/b;
}
static void s()
{
d();
}
static void s1()
{
try
{
s();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}

public static void main(String args[])
{
s1();
System.out.println(" handle proply");
}
}
