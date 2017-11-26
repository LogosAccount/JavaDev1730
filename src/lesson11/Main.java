package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Iterable<String> iterable = new ArrayList<>();
		Collection<String> collection = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("w");
		list.add("e");
		list.addAll(Arrays.asList("l","c", "o"));
		System.out.println(list.contains("l"));
		System.out.println(list.containsAll(Arrays.asList("c", "l", "o")));
		System.out.println(list.equals(Arrays.asList("c", "l", "o")));
		System.out.println(list.get(4));
		System.out.println(list.remove(2));
		list.set(0, "r");
		List<String> subList = list.subList(1, list.size());
		System.out.println(subList);
		System.out.println(list);
		
		System.out.println("For i");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Foreach");
		for(String elementFromList : list){
			System.out.println(elementFromList);
		}
	
		iterable.forEach(elementFromList -> System.out.println(elementFromList));
		
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("c")) {
				list.remove(i);
			}
		}
		list.add("c");
		
		list.removeIf(element -> element.equals("c"));
		
		System.out.println(list);
		
		randomMethod(list);
	}

	private static void randomMethod(Collection<String> list) {
		
	}

}
