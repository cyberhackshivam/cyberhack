class g1<T>
{
T v1;
g1(T v)
{
v1=v;
}
T show()
{
return v1;
}
}
class g2{
public static void main(String args[])
{
g1<Integer>g11=new g1<Integer>(20);
int k=g11.show();
System.out.println(k);
g1<String>g22=new g1<String>("ABC");
String k1=g22.show();
System.out.println(k1);
}
}
