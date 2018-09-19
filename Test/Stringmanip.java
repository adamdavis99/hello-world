import java.io.*;
class Stringmanip
{
    public static void main(String g[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s=br.readLine();
        System.out.println("Total number of cahracters = "+s.length());
        String v="AEIOUaeiou";int c=0;String t="";s=s.trim();s+=" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(v.indexOf(ch)!=-1)
            c++;
            if(ch!=' ')
            t=ch+t;
            else
            {
                System.out.println("Reverse String is "+t);
                t="";
            }
        }
        System.out.println("Total number of vowels is "+c);
    }
}