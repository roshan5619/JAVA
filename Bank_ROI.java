class RBIBank
{
    int getRateOfInterest_FD()
    {
        return 6;
    }
}
class SBI extends RBIBank
{
    int getRateOfInterest_FD()
    {
        return 8;
    }
}
class ICICI extends RBIBank
{
    int getRateOfInterest_FD()
    {
        return 10;
    }
}
class AXIS extends RBIBank
{
    int getRateOfInterest_FD()
    {
        return 12;
    }
}
class Bank_ROI
{
    public static void main(String args[])
    {
        SBI s= new SBI();
        ICICI i = new ICICI();
        AXIS a= new AXIS();
        System.out.println("SBI Intrest Rate:"+s.getRateOfInterest_FD());
        System.out.println("ICICI Intrest Rate:"+i.getRateOfInterest_FD());
        System.out.println("AXIS Intrest Rate:"+a.getRateOfInterest_FD());
        

    }
}