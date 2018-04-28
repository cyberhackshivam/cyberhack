import java.util.*;
class s<T extends Number>
{
T a[];
s(T[] a1)
{
a=a1;
}

int avg()
{
int sum1=0;
for(int i=0;i<a.length;i++)
{
sum1=sum1+a[i].intValue();
}
int avg=sum1/a.length;

return avg;
}
double avg1()
{
double sum2=0;
for(int i=0;i<a.length;i++)
{
sum2=sum2+a[i].doubleValue();
}
return sum2/a.length;


}
float avg2()
{
float sum3=0;
for(int i=0;i<a.length;i++)
{
sum3=sum3+a[i].floatValue();
}
return sum3/a.length;


}
}

class test1
{
public static void main(String args[])
{
Integer ia[]={1,2,3,4,5};
s<Integer>iob=new s<>(ia);
Integer s1=iob.avg();
System.out.println(" the avg is  in integer "+s1);
Double ia1[]={1.1,2.2,3.3,4.4,5.5};
s<Double>iob1=new s<>(ia1);
Double s2=iob1.avg1();
System.out.println(" the avg is in double "+s2);
Float ia2[]={1.1f,2.2f,3.3f,4.4f,5.5f};
s<Float>iob2=new s<>(ia2);
Float s3=iob2.avg2();
System.out.println(" the avg of float is " +s3);

}
}
