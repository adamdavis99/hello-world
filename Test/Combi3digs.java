class Combi3digs
{
    public static void main(int no)
    {
        
        
                for(int i=1;i<=3;i++)
        {
            int d1=no%10;int d2=(no/10)%10;int t=no/100;
            int s1=t*100 + d1*10+d2;
            int s2=t*100 + d2*10+d1;
            System.out.println(s1+"\n"+s2);
            no=(no%100)*10+no/100;
        }
    }
}