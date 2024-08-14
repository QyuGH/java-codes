import java.util.Scanner;

public class Search {

    public static void lookFor(int size, int target, int[] myArray){
        boolean found = false;
        for (int i = 0; i < size; i++){
            if (myArray[i] == target){
                found = true;
                System.out.printf("Target found at index %d", i);
                break;
            } 
        }

        if (!found){
            System.out.print("Target not found");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.print("Enter a target value: ");
        int target = scanner.nextInt();

        lookFor(size, target, myArray);
    }
}