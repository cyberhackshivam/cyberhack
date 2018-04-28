class factorial
{
   public static void main(String args[])
   {
      int n, c, fact = 1;
 
      
 
      n = 5;
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}