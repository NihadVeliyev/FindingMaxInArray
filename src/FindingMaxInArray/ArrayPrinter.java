package FindingMaxInArray;

public class ArrayPrinter {
    public static void main(String[] args) {

        printArr(new int[]{1, 2, 3, 4});

    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index: " + i + " value: " + arr[i]);
        }
    }

}
