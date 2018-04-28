class s<T extends Number>
{
T a[];
s(T[] a1)
{
a=a1;
}

int sum()
{
int sum1=0;
for(int i=0;i<a.length;i++)
{
sum1=sum1+a[i].intValue();
}
return sum1;
}
}

class demo
{
public static void main(String args[])
{
Integer ia[]={1,2,3,4,5};
s<Integer>iob=new s<>(ia);
Integer s1=iob.sum();
System.out.println(" the sum is  "+s1);
}
}
