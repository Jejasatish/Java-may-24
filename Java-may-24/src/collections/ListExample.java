package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	List list = new ArrayList();
	
	list.add(true);
	list.add(100);
	list.add('A');
	list.add(10000L);
	list.add(100.5F);
	list.add(100.456E35D);
	list.add("Hello");
	list.add("ListExample()");
	list.add('A');
	
	List list2 = new ArrayList();
	
	list2.add(true);
	list2.add(100);
	list2.add('A');
	list2.add(10000L);
	list2.add(100.5F);
	list2.add(100.456E35D);
	list2.add("Hello");
	list2.add("ListExample()");
	list2.add('A');
	
System.out.println(list);
System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.get(7));
System.out.println(list.get(8));

    //   int int1 = (int) list.get(1);
    //    int int2 = (int) list.get(7);
       
System.out.println(list.contains("Helloo"));
System.out.println(list.contains("Hello"));

list.add(8, 5);
System.out.println(list);

//List list2 = list;
System.out.println(list.equals(list2));

System.out.println(list2.size());

System.out.println(list.isEmpty());

for (Object eachObj : list) {
	
	System.out.println(eachObj);
	
	System.out.println(list2.indexOf("ListExample()"));
	
}

	

	}

}
