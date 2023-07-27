abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}
class TestAbstraction
{
    public static void main(String args[])
    {
        Shape s= new Circle();
        s.draw();
         Shape s1= new Rectangle();
        s1.draw();
         Shape s2= new Circle();
        s2.draw();
    }
}