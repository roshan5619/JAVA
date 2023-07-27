class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is Running");
    }    
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is Running Safely");
    }
}
    public class Overriding_Vehicle
{
        public static void main(String args[])
        {
            Bike b1=new Bike();
            b1.run();
        }
}

