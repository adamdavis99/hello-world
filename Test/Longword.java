import java.util.*;
class Longword
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        String t="";String max="";
        s=s.trim();s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            t+=ch;
            else
            {
                if(t.length()>max.length())
                max=t;
                t="";
            }
        }
        System.out.print("Longest word length is "+max.length());
    }}
        

        