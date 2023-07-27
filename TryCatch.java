class TryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int n=100/0;
            String name=null;
            System.out.println(name.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}