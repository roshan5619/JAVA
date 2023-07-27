interface Drawbale
{
    void draw();
}
class Rectangle implements Drawbale
{
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements Drawbale
{
    public void draw()
    {
        System.out.println("Drawing Circle");
    }
}
class Test1
{
    public static void main(String args[])
    {
        Rectangle obj=new Rectangle();
        obj.draw();
        Circle obj1=new Circle();
        obj1.draw();
    }
}