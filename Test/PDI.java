import java.util.*;
class PDI
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("Enter 1 for PDI checking\nEnter 2 for perfect checking");
        
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:if(isPDI(no))
                   System.out.println("PDI number");
                   else 
                   System.out.println("Not PDI number");
            break;
            case 2:if(isperfect(no))
                   System.out.println("Perfect number");
                   else
                   System.out.println("Not perfect number");
            break;
        default:System.out.println("Wrong choice");
    }

}
static boolean isPDI(int no)
{
    int t=no,c=0;
    while(t>0)
    {
        c++;
        t=t/10;
    }
    int s=0;
    t=no;
    while(t>0)
    {
        int d=t%10;
        s+=Math.pow(d,c);
        t/=10;
    }
    if(no==s)
    return true;
    else
    return false;
}
static boolean isperfect(int no)
{
    int s=0;
    for(int i=1;i<no;i++)
    if(no%i==0)
    s+=i;
    if(s==no)
    return true;
    else 
    return false;
}
}
    
        
                