class prime
{
    public static void main(String args[])
    {
        int n =5;
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
        }else
        {
            System.out.println(" Not Prime number");
        }
    }
}