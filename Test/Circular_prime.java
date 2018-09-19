class Circular_prime
{
    public static void main(String g[])
    {
        int no=1193;int t=no;int t1=no;int c=1;
        while(t1>0)
        {
            c*=10;t1/=10;
        }
        c/=10;int fl=0;
            
        
        do
        {
            t=(t%c)*10+(t/c);
            if(!(isprime(t)))
            {
                System.out.println("Not circular "+no);
                fl=1;break;
            }
        }while(t!=no);
        if(fl==0)
        System.out.println("Circular prime "+no);
    }
    public static boolean isprime(int no)
    {
        int c=0;
        for(int i=1;i<=no;i++)
        if(no%i==0)
        c++;
        if(c==2)
        return true;
        else
         return false;
        }
        
}
        