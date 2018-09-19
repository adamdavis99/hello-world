import java.io.*;
class Sumnumbers
{
    public static void main(String g[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter integers,0 to terminate");
         double n=0.0,sumneg=0.0,spen=0.0,spon=0.0;
         do
         {
             n=Double.parseDouble(br.readLine());
             
             
              if(n<0)
             sumneg+=n;
             else if(n>0 && n%2==0)
             spen+=n;
             else if(n>0 && n%2!=0)
             spon+=n;
            }while(n!=0);
            System.out.println("Sum negative= "+sumneg);
            System.out.println("Sum of positive even= "+spen);
            System.out.println("Sum of positive odd= "+spon);
        }
    }
    
            