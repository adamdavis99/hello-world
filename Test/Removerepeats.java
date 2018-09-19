class Removerepeats
{
    public static void main(String g[])
    {
        String s="applications";int f=0,u=0;String t="";
        for(int i=0;i<s.length();i++)
        {
            f=0;u=0;
            for(int j=i+1;j<s.length();j++)
            if(s.charAt(j)==s.charAt(i))
            f=1;
            for(int k=0;k<i;k++)
            if(s.charAt(i)==s.charAt(k))
            u=1;
            if(u==0)
            t+=s.charAt(i);
        }
        System.out.println(t);
    }
}
            