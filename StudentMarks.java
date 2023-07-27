class Student
{
    int roll_no;
    String stu_name;
    double marks1,marks2,marks3,marks4;
    Student()
    {
        roll_no=1001;
        stu_name="Roshan";
        marks1=98;
        marks2=88;
        marks3=92;
        marks4=95;

    }
}
class StudentMarks
    {
        public static void main(String args[])
        {
            Student s1=new Student();
            System.out.println("s1 roll no="+s1.roll_no);
            System.out.println("s1 Student Name="+s1.stu_name);
            System.out.println("s1 Marks1="+s1.marks1);
            System.out.println("s1 Marks2="+s1.marks2);
            System.out.println("s1 Marks3="+s1.marks3);
            System.out.println("s1 Marks4="+s1.marks4);
            Student s2=new Student();
            System.out.println("s2 roll no="+s2.roll_no);
            System.out.println("s2 Student Name="+s2.stu_name);
            System.out.println("s2 Marks1="+s2.marks1);
            System.out.println("s2 Marks2="+s2.marks2);
            System.out.println("s2 Marks3="+s2.marks3);
            System.out.println("s2 Marks4="+s2.marks4);
        }
    }