abstract class person
{
    abstract void eat();
    
}
class testAnonymousinner {
    public static void main(String args [])
    {
        person p=new person()
        {
            void eat()
            {
                System.out.println(" nice fruit");
                
            }
        };
        p.eat();
    }
}