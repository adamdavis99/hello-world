import java.util.*;
class Fraction
{
    int n,d;
    Fraction(int nn,int dd)
    {
        n=nn;d=dd;}
        int hcf(int a,int b)
        {
            int h=0;
            for(int i=1;i<=a && i<=b;i++)
            {
                if(a%i==0 && b%i==0)
                h=i;
            }
                return h;
            
        }
        int lcm(int a,int b)
        {
            return (a*b)/hcf(a,b);
        }
        Fraction addto(Fraction f)
        {
            Fraction temp=new Fraction(0,0);
            int x=lcm(d,f.d);
            temp.n=n*(x/d)+f.n*(x/f.d);
            temp.d=x;
            int y=hcf(temp.n,temp.d);
            temp.n/=y;temp.d/=y;
            return temp;
        }
        public static void main(String g[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter numerators and denominators");
            int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();int d=sc.nextInt();
            Fraction f1=new Fraction(a,b);
            Fraction f2=new Fraction(c,d);
            Fraction f3=f1.addto(f2);
            System.out.println("New fraction ="+f3.n+"/"+f3.d);
            
        }
    }
            
            
        