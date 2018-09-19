import java.util.*;
class Project_com
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date, month, year separately");
        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int yy=sc.nextInt();
        System.out.println("Enter number of days");
        int wdays=sc.nextInt();
        int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(yy%400==0 ||(yy%100!=0 && yy%4==0))
        m[1]=29;
        int x=1;
        while(x<=wdays)
        {
            dd++;
            if(dd>m[mm-1])
            {dd=1;mm++;}
            if(mm>12)
            {
                yy++;mm=1;}
            if(yy%400==0 ||(yy%100!=0 && yy%4==0))
        m[1]=29;
        x++;
    }
    System.out.println("Completion date is "+dd+"/"+mm+"/"+yy);
}
}
        