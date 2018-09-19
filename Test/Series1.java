class Series1
{
    public static void main(int n)
    {
        double s=0.0;
        for(int i=4;i<=4*n;i+=4)
        s+=1.0/i;
        System.out.println("Sum is= "+s);
    }
}