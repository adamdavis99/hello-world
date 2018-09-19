import java.util.*;
class Choice
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter a number");
            int no=sc.nextInt();
            if(no%7==0 || no%10==7)
            System.out.println("Buzzz "+no);
            else
            System.out.println("Not a buzz "+no);
        }
        else if(ch==2)
        {
            System.out.println("Enter two numbers");
            int no1=sc.nextInt();
            int no2=sc.nextInt();
            int t;
            if(no2>no1)
            {
                int x=no1;
                no1=no2;
                no2=x;}
                while(no1%no2!=0)
                {
                    t=no1;
                    no1=no2;
                    no2=t%no2;
                }
                System.out.println("GCD is "+no2);
            }
            else
            System.out.println("Wrogn coice");
        }
    }
            
            