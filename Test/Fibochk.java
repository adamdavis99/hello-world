import java.util.*;
class Fibochk
{
    int a[]=new int[10];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten numbers");
        for(int i=0;i<10;i++)
        a[i]=sc.nextInt();
    }
    int fibo()
    {
        int max=-1;
        for(int i=0;i<10;i++)
        {
            int c=0,as=1,b=0;
            for(c=0;c<a[i]; )
            {
                c=as+b;
                if(c==a[i] && c>max)
                max=a[i];
                as=b;b=c;
            }
        }
        return max;
    }
    public static void main(String g[])
    {
        Fibochk f=new Fibochk();
        f.input();
        int fib=f.fibo();
        if(fib==-1)
        System.out.println("No fibonacci number");
        else
        System.out.println("Greatest fibonacci number is "+fib);
    }
}
        
