import java.util.*;
class Notediv
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amt=sc.nextInt();int t=amt;
        int fh,oh,fif,twen,ten,five,two,one;
        fh=oh=fif=twen=ten=five=two=one=0;
        
        
        fh=amt/500;
        amt=amt%500;
        oh=amt/100;
        amt=amt%100;
        fif=amt/50;
        amt=amt%50;
        twen=amt/20;
        amt%=20;
        ten=amt/10;
        amt%=10;
        five=amt/5;
        amt%=5;
        two=amt/2;
        amt%=2;
        one=amt;
    
    System.out.println("Amount is "+t+"\nNumber of five hundred notes "+fh+"\nNumber of hundred notes "+oh+"\nNumber of fifty notes "+fif+"\nNumber of twenty notes "+twen+"\nNumber of ten notes "+ten+"\nNumber of five notes "+five+"\nNumber of two notes "+two+"\nNumber of one notes "+one);
}
}
        