import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] stringNum = {"first", "second", "third", "fourth", "fifth"};

        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Enter " + stringNum[i] + " element: ");
            num[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int found = 0;
        for (int i = 0; i < 5; i++){
            if (target == num[i]){
                found++;
                System.out.printf("Target found at index: %d!", i);
                break;
            }
        }

        if (found == 0){
            System.out.print("Target not found!");
        }
        scanner.close();
    }
}