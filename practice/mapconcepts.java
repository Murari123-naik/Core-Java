package practice;

import java.util.HashMap;
import java.util.Map;

public class mapconcepts {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap();
		
		m.put(1, "murari");
		m.put(2, "Naik");
		m.put(3, "Murari naik");
		
		System.out.println(m);
		
		System.out.println(m.get(2));
		m.keySet();
		System.out.println(m);
		m.size();
		System.out.println(m);
		m.clear();
		System.out.println(m);
		System.out.println(m.isEmpty());
		//System.out.println(m);

	}

}
