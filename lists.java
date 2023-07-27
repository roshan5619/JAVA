import java.util.*;
class lists
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("Luffy");
        System.out.println(list.get(1));
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
    }
}