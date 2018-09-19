class Patternnos
{
    public static void main(String g[])
    {
        int h=4,i,j,sp,c=h-1;
        for(i=1;i<=h;i++)
        {
            for(sp=1;sp<=c;sp++)
            System.out.print(" ");
            c--;
            for(j=1;j<=i;j++)
            System.out.print(j);
            for(j=i-1;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
        c=1;
        for(i=h-1;i>=1;i--)
        {
            for(sp=1;sp<=c;sp++)
            System.out.print(" ");c++;
            for(j=1;j<=i;j++)
            System.out.print(j);
            for(j=i-1;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}