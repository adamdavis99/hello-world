class Array
{
    public static void main(String g[])
    {
        int a[]={4,5,7,9,1,2,6,3,0,10};
        int min=9,max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}