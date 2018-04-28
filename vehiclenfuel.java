import java.util.Scanner;


class vehicle

{
	double mileage;
	int fuel;
	
Scanner sc = new Scanner(System.in);

	
vehicle()

	
{
	
	fuel = 0;
	
}

	
void addfuel()

	{
		
System.out.println("How much fuel is to be added");
	
	fuel = fuel + sc.nextInt();
	
}
}


class bike extends vehicle

{
	String name;

	int maxspeed;

	
void remainingfuel()
	
{
		
super.fuel = super.fuel - (maxspeed/2);
		
if(super.fuel < 0)	
super.fuel=0;
		
System.out.println("Remaining fuel in the bike : "+super.fuel+" litres");
	
}
}


class car extends vehicle

{
	String name;
	int maxspeed;

	void remainingfuel()
	
{
		
super.fuel = super.fuel - (2*(maxspeed/3));
              
  
if(super.fuel < 0)     
 super.fuel=0;
                
System.out.println("Remaining fuel in the car : "+super.fuel+" litres");
	
}
}


class vehiclenfuel

{
	public static void main(String args[])

	{
	bike b1 = new bike();

	car c1 = new car();
	
Scanner sc = new Scanner(System.in);

	
System.out.println("Enter bike name : ");
	
b1.name = sc.next();

	
b1.addfuel();

System.out.println("Fuel now : "+b1.fuel+" litres");

	
System.out.println("Whats the speed it ran on?");
	
b1.maxspeed = sc.nextInt();

	
b1.remainingfuel();

	
System.out.println("Enter car name : ");
    
    c1.name = sc.next();

      
  c1.addfuel();
      
  System.out.println("Fuel now : "+c1.fuel+" litres");

     
   System.out.println("Whats the speed it ran on?");

	
c1.maxspeed = sc.nextInt();

	
c1.remainingfuel();
	}
}
