import java.util.*;
class Allvowels
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();int a=0;int e=0;int i=0;int o=0; int u=0;
        s=s.trim();s+=" ";
        String t="";
        for(int q=0;q<s.length();q++)
        {
            char ch1=s.charAt(q);
            if(ch1!=' ')
            t+=ch1;
            else
            {
                a=e=i=o=u=0;
                for(int j=0;j<t.length();j++)
                {
                    char ch=t.charAt(j);
                    if(ch=='a' || ch=='A')
                    a++;
                    if(ch=='i'||ch=='I')
                    i++;
                    if(ch=='e'|| ch=='E')
                    e++;
                    if(ch=='o'||ch=='O')
                    o++;
                    if(ch=='u'||ch=='U')
                    u++;
                }
                if(a>0 && e>0 && i>0 && o>0 && u>0)
                System.out.println(t+" ");
                t="";
            }
        }
        System.out.println("Better luck next time");
    }
}
                    
        