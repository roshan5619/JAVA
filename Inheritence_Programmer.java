class Employee
{
    float salary=90000;
}
class Inheritence_Programmer extends Employee
 {
    int bonus=10000;
    public static void main(String args[])
    {
        Inheritence_Programmer p=new Inheritence_Programmer();
        System.out.println("Salary="+p.salary);
        System.out.println("Bonus="+p.bonus);

    }
}
