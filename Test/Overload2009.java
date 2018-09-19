class Overload2009
{
    public void num_calc(int num,char ch)
    {
        if(ch=='s')
        System.out.println("Print = "+(num*num));
        else
        System.out.println("Print = "+(num*num*num));
    }
    public void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        System.out.println("Print= "+(a*b));
        else
        System.out.println("Print= "+(a+b));
    }
    public void num_calc(String s1,String s2)
    {
        if(s1==s2)
        System.out.println("Equal strings");
        else
        System.out.println("Not equal strings");
    }
}