import java.util.*;

public class Sort {
    public static int[] sortArray(int[] myArr, int size){
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (myArr[j] > myArr[j + 1]){
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        return myArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of your array: ");
        int size = scanner.nextInt();

        int[] myArr = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++){
            myArr[i] = scanner.nextInt();
        }

        sortArray(myArr, size);
        System.out.println("The sorted array elements are: ");
        for (int i = 0; i < size; i++){
            System.out.printf("%d\n", myArr[i]);
        }

        scanner.close();
    }
}
