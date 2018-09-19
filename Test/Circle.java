class Circle extends Plane
{
    private int x2,y2;
    private double radius,area;
    Circle(int x,int y,int a,int b)
    {
        super(x,y);
        x2=a;y2=b;
    }
    public  void findradius()
    {
        radius=(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))/2.0;
    }
    public void findarea()
    {
        area=Math.PI*Math.pow(radius,2);
    }
    public void show()
    {
        super.show();
        findradius();
        findarea();
        System.out.println(x2+","+y2);
        System.out.println("Radius= "+radius);
        System.out.println("Area= "+area);
    }
}