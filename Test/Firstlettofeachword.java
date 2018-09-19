import java.io.*;
class Firstlettofeachword
{
    public static void main(String g[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String s=br.readLine();
        s=s.trim();s=s+" ";
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            t=t+ch;
            else
            {
                System.out.print(t.charAt(0)+".");
                t="";
            }
        }
    }}