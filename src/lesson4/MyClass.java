package lesson4;


public class MyClass {

	public static void main(String[] args) {
		int[] array = {5, 23, 11, 8};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String s1 = "Cat";
		String s2 = new String("Cat");
		
		System.out.println(s1.equals(s2));
	}

}
