import java.util.*;
class Piglatin
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);String t="";
        while(true)
        {
            System.out.println("Enter a word");
            t=sc.next();
            break;
        }
        t=t.toUpperCase();int l=0;
        String s="AEIOU";for(int i=0;i<t.length();i++)
        {
            if(s.indexOf(t.charAt(i))!=-1)
            {l=i;break;}}
        
        
            
             if(s.indexOf(t.charAt(0))!=-1)
            System.out.print(t+"AY");
            else
            System.out.print(t.substring(l)+t.substring(0,l)+"AY");
        
    }
}