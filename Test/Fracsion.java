public class Fracsion
{
    private int num;private int den;
    public Fracsion(int n,int d)
    { 
        
        if(d==0)
        throw IllegealArgumentException("Denominator cannot be 0");
        if(d<0)
        {d*=-1;n*=-1}
        num=n;den=d;
        
    }
    public Fracsion(int n)
    {
        num=n;den=1;
    }
    public Fracsion()
    {
        num=0;den=1;
    }
    public int getName()
    {
        return num;
    }
    public int getDenominator()
    {
        return den;
    }
    public String toString()
    {
        String s=Integer.toString(num);
        String t=Integer.toString(den);
        String u=s+"/"+t;
        return u;
    }
    public double toDouble()
    {
        double d=num*1.0/den;
        return d;
    }
    public Fracsion add(Fracsion f)
    {
        int n=this.num+f.num;
        int d=this.den+f.den;
        Fracsion fn=new Fracsion(n,d);
        return fn;
    }
     public Fracsion subtract(Fracsion f)
    {
        int n=f.num-this.num;
        int d=f.den-this.den;
        Fracsion fn=new Fracsion(n,d);
        return fn;
    }
     public Fracsion multiply(Fracsion f)
    {
        int n=this.num*f.num;
        int d=this.den*f.den;
        Fracsion fn=new Fracsion(n,d);
        return fn;
    }
     public Fracsion divide(Fracsion f)
    {
        int n=this.num+f.num;
        int d=this.den+f.den;
        Fracsion fn=new Fracsion(n,d);
        return fn;
    }
    
    
        
        
    
    
    
        