class prime
{
    public static void main(String args[])
    {
        int n =5;

        
        System.out.println("Prime number Using boolean = "+PrimeUsingBoolean(n));
        System.out.println("Prime number Using Count = "+PrimeUsingcount(n));

    }

        public static void PrimeUsingcount(int n)
        {
            int count =1;

             for(int i=2;i<=n;i++)
            {
                if(n % i == 0)
                {
                    count++;
                    break;
                }
            }
             if(count == 2)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println(" Not Prime number");
            }   
        
        }

         public static boolean PrimeUsingBoolean(int n)
         {
          boolean isboolean =true; 


             for(int i=2;i<=n;i++)
            {
                if(n % i == 0)
                {
                  isboolean = false;
                    break;
                }
            }
             return isboolean;
        }


}