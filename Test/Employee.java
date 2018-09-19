class Employee
{
    private static double basic;
    public static void main(String g[])
    {
        basic=25000.0;
        double da=0.25*basic;
        double hra=0.15*basic;
        double pf=0.0833*basic;
        double np=basic+da+hra;
        double gp=np-pf;
        System.out.println("Gross pay = "+gp);
    }
}
        