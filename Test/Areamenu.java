import java.io.*;
class Areamenu
{
    public void area()throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        double area=0.0,rad=0.0,side=0.0,length=0.0,breadth=0.0;
        System.out.println("1 for circle \n2 for square \n3 for rectangle");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:System.out.println("Enter radius");
            rad=Double.parseDouble(br.readLine());
            System.out.println("Area is "+(Math.PI*rad*rad));
            break;
            case 2:System.out.println("Enter side");
            side=Double.parseDouble(br.readLine());
            System.out.println("Area is "+(side*side));
            break;
            case 3:System.out.println("Enter length and breadth");
            length=Double.parseDouble(br.readLine());
            breadth=Double.parseDouble(br.readLine());
            System.out.println("Area is "+(length*breadth));
            break;
            default:System.out.println("Wrong choice");
        }
    }
}
        
        