class Sumprime
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        if(n%i==0)
        c++;
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main(String g[])
    {
        for(int i=1;i<=100;i++)
        {
            if(isprime(i)==true)
            System.out.println(i);
        }
    }
}
