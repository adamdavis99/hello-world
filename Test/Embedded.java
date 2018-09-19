class Embedded
{
    public static void main(String g[])
    {
        String s="This is a program ";
        String sword="is";String rword="was";int n=0;
        while(n!=-1)
        {
            n=s.indexOf(sword);
            if(n==-1)
            break;
            
            s=s.substring(0,n)+rword+s.substring(sword.length()+n);
        }
        System.out.println(s);
    }
}
        
        
    