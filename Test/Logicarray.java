class Logicarray
{
    public static void main(String g[])
    {
        int a[]={2,6,12,20,30,42};
        for(int i=a.length;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            System.out.print(a[j]+" ");
            for(int k=0;k<i-1;k++)
            a[k]=a[k+1]-a[k];
            System.out.println();
        }
    }
}