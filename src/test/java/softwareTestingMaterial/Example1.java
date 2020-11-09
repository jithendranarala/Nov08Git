package softwareTestingMaterial;

import java.util.Hashtable;

public class Example1 {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		System.out.println(h.get("C"));
		h.put("C", "Jithendra");
		System.out.println(h.get("C"));
		h.remove("C");
		System.out.println(h.get("C"));
	
	}

}
