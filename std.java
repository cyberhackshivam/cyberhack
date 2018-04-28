class std
{ 
int id;
String name;
int rollnumbe;
static String callage="lpu";
void insert(int a,String b,int c)
{
id=a;
name=b;
rollnumbe=c;
}
void display()
{
System.out.println(id+" " +name+" "+rollnumbe+" "+callage);
}
public static void main(String args[])
{std x1=new std();
std x2=new std();
x1.insert(23,"abc",5);
x2.insert(24,"dbc",6);
x1.display();
x2.display();

}
}