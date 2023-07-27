import java.util.*;
class GFG1{
    public static void main(String[] args){
    List<Integer> m1=new ArrayList<Integer>();
    m1.add(0,11);
    m1.add(1,12);
    System.out.println("m1 data" +m1);//11 12
    List<Integer> m2=new ArrayList<Integer>();
    m2.add(1);
    m2.add(2);
    m2.add(3);
    System.out.println("m2 data"+m2);// 1 2 3
    m1.addAll(1, m2);//Will add list 12 from 1 index
    System.out.println("m1 data"+m1);
    System.out.println("M1 data"+m1);
    System.out.println("Retrive index 3 data from m1- "+m1.get(3));
    m1.set(0,5);
    System.out.println(m1);
    
    }
}