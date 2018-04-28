immport java.util.*;
class vehicle
{
double milage;
int a;
double fuel=0;
Scanner sc=new Scanner(Syatem.in);
public void addfuel()
{
System.out.println(" enter the anount of liter of fuel u want to add : ");
a=sc.nextInt();
fuel=fuel+a;

}
}
class bike extends vehicle
{
String name;
String max_speed;
public void remaingfuel()
{
if (max_speed>90)
{fuel=fuel-4;
System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
else if(60<max_speed && max_speed<90)
{
fuel=fuel-8;
System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
else 
{
fuel=fuel-10;

System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
}
}
class car extends vehicle
{
String name;
String max_speed;
public void remaingfuel()
{
if (max_speed>90)
{fuel=fuel-8;
System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
else if(60<max_speed && max_speed<90)
{
fuel=fuel-11;
System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
else 
{
fuel=fuel-12;

System.out.println(" remaing fuel in the tank is " + " "+fuel);
}
}
}

class race
{ public static void main(String arg[])
{
bike b1=new bike();
car c1=new car();
race()
{




 
