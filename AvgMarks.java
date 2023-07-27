class Student
{
    int roll_no;
    String stu_name;
    double marks1,marks2,marks3,marks4;
    public void average()
    {
        double avg=(marks1+marks2+marks3+marks4)/4;
        System.out.println("Average Marks is:"+avg);
    }
}
public class AvgMarks
{
    public static void main(String []args)
    {
        Student s1=new Student();
        System.out.println("S1 roll no before assignment="+s1.roll_no);
        s1.roll_no=1001;
        System.out.println("s1 roll no="+s1.roll_no);
        System.out.println("S1 student name before assignment="+s1.stu_name);
        s1.stu_name="Roshan";
        System.out.println("s1 Student Name="+s1.stu_name);
        System.out.println("S1 Marks1 before assignment="+s1.marks1);
        s1.marks1=98;
        System.out.println("s1 Marks1="+s1.marks1);
        System.out.println("S1 Marks2 before assignment="+s1.marks2);
        s1.marks2=93;
        System.out.println("s1 Marks2="+s1.marks2);
        System.out.println("S1 Marks3 before assignment="+s1.marks3);
        s1.marks3=88;
        System.out.println("s1 Marks3="+s1.marks3);
        System.out.println("S1 Marks4 before assignment="+s1.marks4);
        s1.marks4=86;
        System.out.println("s1 Marks4="+s1.marks4);
        s1.average();

    }
    
}
