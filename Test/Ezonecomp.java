import java.util.*;
class Ezonecomp
{
    private String name,address;private char type;private double amt;
    public  void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, address, type and amt");
         name=sc.nextLine();
         address=sc.nextLine();
        type=sc.next().charAt(0);
        amt=sc.nextDouble();
        double dis=0.0;
        if(type=='L' || type=='l')
        {
            if(amt<=25000)
            dis=0.0;
            else if(amt<=57000)
            dis=5.0;
            else if(amt<=100000)
            dis =7.5;
            else
            dis=10.0;
        }
        else if(type=='D' || type=='d')
        {
            if(amt<=25000)
            dis=5.0;
            else if(amt<=57000)
            dis=7.5;
            else if(amt<=100000)
            dis =10.0;
            else
            dis=15.0;
        }
        double netamt=amt-((dis/100)*amt);
        System.out.println("Name= "+name);
        System.out.println("Address = "+address);
        System.out.println("Net payable amount = "+netamt);
    }
}
            