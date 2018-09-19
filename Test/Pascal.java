class Pascal
{
    public static void main(String g[])
    {
        int h=5;
        int a[]=new int[h];a[0]=1;
        for(int i=0;i<h-1;i++)
        {
            for(int j=0;j<=i;j++)
            System.out.print(a[j]);
            for(int k=i+1;k>=1;k--)
            a[k]=a[k]+a[k-1];
            System.out.println();
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]);
    }
}
        
        
