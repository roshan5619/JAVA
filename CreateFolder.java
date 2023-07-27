import java.util.Scanner;
import java.io.File;
class CreateFolder
{
    public static void main(String[] args)
    {
        System.out.println("Enter the path where you want to create a floder : ");
        Scanner scan=new Scanner(System.in);
        String path=scan.next();
        System.out.println("Enter the name of the desired directory : ");
        path=path+scan.next();
        File f1=new File(path);
        boolean bool=f1.mkdir();
        if(bool)
            System.out.println("Folder is created succesfully");
        else
            System.out.println("Folder not created");
    }
}