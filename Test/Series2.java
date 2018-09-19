class Series2
{
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;
    }
    public static void main(int n)
    {
        double s=0.0;int m=1;
        for(int i=1;i<=n;i++)
        {s+=(i*1.0/fact(i))*m;m*=-1;}
        System.out.println("Sum is = "+s);
    }
}