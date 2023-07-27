import java.util.*;  
class TestGenerics1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
//ArrayList<Integer> list=new ArrayList<Integer>();  
list.add("11");  
list.add("12");  
list.add("11");  
list.add("12");  
list.add("11");  
list.add("12");  
list.add("11");  
list.add("12");  
list.add("15");  
list.add("16");  
//list.add(32);//compile time error  
  

String s=list.get(1);
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}