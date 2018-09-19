class joyover2015
{
    void joystring(String s,char ch1,char ch2)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch1)
            
                t+=ch2;
                else
                t+=s.charAt(i);
            
        }
        System.out.println(s);
        System.out.println("After changing");
        System.out.println(t);
    }
    void joystring(String s)
    {
        System.out.println(s.indexOf(' '));
        System.out.println(s.lastIndexOf(' '));
    }
    void joystring(String s1,String s2)
    {
        System.out.println(s1+" "+s2);
    }
}
            