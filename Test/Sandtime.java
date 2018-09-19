import java.util.*;
class Sandtime
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();int i,j,c=1;
        for(i=h;i>=1;i--)
        {
            for(int sp=1;sp<c;sp++)
            System.out.print(" ");
            c++;
            for(j=2*i-1;j>=1;j--)
            System.out.print("*");
            System.out.println();
        }
        for(i=2;i<=h;i++)
        {
            for(int sp=1;sp<c-2;sp++)
            System.out.print(" ");
            c--;
            for(j=2*i-1;j>=1;j--)
            System.out.print("*");
            System.out.println();
        }
    }}
            
    