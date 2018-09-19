import java.util.*;
class Trianglemats
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for triangle");
        System.out.println("Enter 2 for inverted triangle");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();System.out.println("Enter no of terms");
        int n=sc.nextInt();
        int i,j;
        if(ch==1)
        {
            for( i=1;i<=n;i++)
            {
                for( j=1;j<=i;j++)
                System.out.print(i);
                System.out.println();
            }
        }
        else if(ch==2)
        {
            for(i=n;i>=1;i--)
            {
                for(j=1;j<=i;j++)
                System.out.print(i);
                System.out.println();
            }
        }
        else
        System.out.println("Wrong choice");
    }
}