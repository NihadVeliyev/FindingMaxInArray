package FindingMaxInArray;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int size=scanner.nextInt();
        int [] numbers = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        int max= numbers[0];
        for(int i=1;i<size;i++){
            if(max< numbers[i]){
                max= numbers[i];
            }
        }
        System.out.println("Largest number is "+max);

        scanner.close();
    }
}
