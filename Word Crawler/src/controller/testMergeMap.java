package controller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class testMergeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,Integer> m1 = new LinkedHashMap<String,Integer>();
//		Map<String,Integer> m2 = new LinkedHashMap<String,Integer>();
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		
		m1.put("a", 1);
		m1.put("b", 1);
		m1.put("c", 4);
		m1.put("d", 4);
		
		m2.put("d", 1);
		m2.put("e", 1);
		m2.put("f", 1);
		m2.put("a", 7);
		
//		m1.putAll(m2);
		m2.forEach((k, v) -> m1.merge(k, v, (v1, v2) -> v1 + v2));
		
		System.out.println(m1);
	}

}
