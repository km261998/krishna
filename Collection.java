package automation_1st_mav_test;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=10;
//		@SuppressWarnings("removal")
//		Integer int1= new Integer(i);//wrapping
//		System.out.print(i);
//		int j = int1;
//		System.out.print(j);//unwrapping
//		ArrayList al= new ArrayList();
//		al.add(10);
//		al.add("Ram");
//		al.add(true);
//		System.out.print(al);
//		al.remove(0);
//		System.out.print(al);
//		System.out.println(al.get(0));
//		for(Object obj:al)
//		{
//			System.out.print(obj);
//		}
//		Iterator itr= al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next());
//		}
//		HashSet<Integer> hst= new HashSet<Integer>();
//		hst.add(20);
//		hst.add(300);
//		hst.add(720);
//		hst.add(20);
//		hst.add(280);
//		System.out.println(hst);
//		Iterator itr=hst.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
		
		HashMap<String,String> hs= new HashMap<String,String>();
		hs.put("name", "KM")	;
		hs.put("class", "10th");
		System.out.print(hs);
		for(String key:hs.keySet())
		{
			System.out.println(hs.get(key));
		}
		}

}
