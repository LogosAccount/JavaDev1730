package consultation1;

public class Main {


    public static void main(String[] args) {
        //Nan
        //Infinite

//        int first = 9;
//        double second = 2d;
//
//        long firstHalf = 1_500_000_000;
//        System.out.println(Long.MAX_VALUE);
//        long secondHalf = 1_500_000_000;
//
//        System.out.println(firstHalf + secondHalf);
//
//        String previousLotBet = "0.0";
//        String lotBet = "0.0";
//
//        double previousLotNumber = Double.valueOf(previousLotBet);
//        double lotBetNumber = Double.valueOf(lotBet);
//
//        System.out.println(lotBetNumber*2);
//
//        System.out.println();

        int[] array = {3, 4, 8, 5, 6, 7, 4, 9};
        inverse(array);
        System.out.println("");
        int[] array2 = {3, 4, 8, 5, 6, 7, 4, 9};
        inverseRec(array2, 0);
        print(array2);
    }

    private static void inverse(int[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
        print(data);
    }

    private static void inverseRec(int[] data, int i) {
        if(i < data.length / 2) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
            inverseRec(data, ++i);
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);
        }
    }
}
