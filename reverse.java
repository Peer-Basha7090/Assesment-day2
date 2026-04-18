class prime
{
    public static void main(String args[])
    {
        int n =123;
        int result;
       while(n>0)
       {
        int rem =n % 10;
        result = result * 10 + rem;
        n = n/10; 
       }
       System.out.println("Reverses numbr is " + result);
    }
}