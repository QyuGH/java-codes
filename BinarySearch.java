import java.util.Scanner;

public class BinarySearch{

    public static void binarySearch(int[] myArr, int size, int target){
        int left = 0;
        int right = size;
        int found = 0;

        while (left < right){
            int mid = left + (right - left) / 2;

            if (myArr[mid] == target){
                System.out.println("Target found at index " + mid);
                found++;
            }
            if (myArr[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if (found == 0){
            System.out.println("Target not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the size of the array: ");
        int arrSize = scanner.nextInt();

        int[] myArr = new int[arrSize];
        for (int i = 0; i < arrSize; i++){
            System.out.print("Input element at index " + i + ": ");
            myArr[i] = scanner.nextInt();
        }

        System.out.print("Input the target value: ");
        int target = scanner.nextInt();

        binarySearch(myArr, arrSize, target);
    }
}