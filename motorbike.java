import java.util.*;
interface vehicle
{
void get_colour();
}
interface bike extends vehicle
{
void get_price();
}

class motorbike implements bike
{
	String s;
	int i;
public void get_colour()
{
System.out.println(" enter he colour u want " );
Scanner sc=new Scanner(System.in);
s=sc.next();
}

public void get_price(){
System.out.println(" enter he buget u  can spend" );
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
}
public void display()
{
System.out.println(" enter ur buget");
System.out.println(" colour u choose is " + s);
System.out.println(" buget u choose is " + i);
}
}

class example
{
public static void main(String args [])
{
motorbike b1=new motorbike();
b1.get_colour();
b1.get_price();
b1.display();
}

}




