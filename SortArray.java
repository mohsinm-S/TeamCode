package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class SortArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
al.add(10);
al.add(2);
al.add(5);
al.add(20);
al.add(82);
al.add(15);

Collections.sort(al);
Collections.reverse(al);

System.out.println(al);
for(int i=0;i<al.size();i++) {
	if(al.get(i).equals(5)) {
	System.err.println(al.get(i));
}}


LinkedList<String> ll=new LinkedList<>();

ll.add("MOJ");
ll.add("X");
ll.add("Ma");

for(String a:ll) {
	System.out.println(a);
}

Collections.sort(ll);
System.out.println(ll);


HashSet<Integer> hs=new HashSet<>();

hs.add(0);
hs.add(12);
System.err.println(hs);
for(Integer a:hs) {
	hs.size();
	System.out.println("HashSet : "+a.hashCode());
}

HashMap<Integer ,String> hm =new HashMap<>();

hm.put(1,"mohsin");
hm.put(2, "allah");
hm.put(3,"Mubeen");

for( String aa:hm.values()) {
	
	if(aa.equals("mohsin")) {
	System.out.println(aa);
	}
}

for(Entry<Integer, String> q :hm.entrySet()) {
	
	if(q.getKey().equals(2)) {
	System.out.println(q.getValue());
}}
//System.out.println(hm.entrySet());




	}

}
