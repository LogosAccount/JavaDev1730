package lesson8;

public class Main {

	public static void main(String[] args) {
		Hunter hunter = new Hunter(22, "Petro");
		Hunter hunter2 = new Hunter(23, "Ivan");
		Gatherer gatherer = new Gatherer(12, "Mykola", "IHBE");
		hunter.eatMeat();
		hunter.run();
		gatherer.run();
		System.out.println(hunter2.getCountOfHunters());
		
		Integer bigInt = 8;
		Double bigDouble = 8.0;
		double max_value = bigDouble.MAX_VALUE;
		System.out.println(max_value);
		
		int[] array = {3, 4, 8, 5, 6, 7, 4, 9};
       

        print(inverseRec(array, 0));
	}
	
	private static int[] inverseRec(int[] data, int i) {
        if(i < data.length / 2) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
            inverseRec(data, i++);
        }
        return data;
    }
	
	 private static void print(int[] array) {
	        for (int i = 0; i < array.length ; i++) {
	            System.out.print(array[i]);
	        }
	    }
}
