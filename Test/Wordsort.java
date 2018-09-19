import java.util.*;
class Wordsort
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence free from numbers");
        String s=sc.nextLine();
        String t="";s=s.trim();s+=" ";String x="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            t+=ch;
            else
            {
                String nt="";
                for(char j='A';j<='Z';j++)
                {
                    for(int k=0;k<t.length();k++)
                    {
                        if(t.charAt(k)==j || t.charAt(k)==(char)(j+32))
                        nt+=t.charAt(k);
                    }
                }
                t="";x=x+nt+" ";
            }}
            System.out.print(x);
        }
    }
        
