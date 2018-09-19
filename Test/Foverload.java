class Foverload
{
    char extract(String s,int c)
    {
        if(c>=s.length())
        return 'Z';
        else
        return(s.charAt(c));
    }
    char extract(String s,String f)
    {
        if(s.startsWith(f))
        return s.charAt(0);
        else
        return 'Z';
    }
    char extract(String s,String f,int c)
    {
        if(c<s.length() && s.endsWith(f))
        return s.charAt(c);
        else
        return 'Z';
    }
    public static void main(String g[])
    {
        Foverload f=new Foverload();
        char ch1=f.extract("Computer",4);
        char ch2=f.extract("Computer","Com");
        char ch3=f.extract("Computer","Sed",7);
        System.out.println(ch1+","+ch2+","+ch3);
    
    }
}