import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int indexNum;
        System.out.print("Enter the size of your index: ");
        indexNum = scanner.nextInt();

        int[] storeNum = new int[indexNum];
        for (int i=0; i<indexNum; i++){
            System.out.print("Enter element: ");
            storeNum[i] = scanner.nextInt();
        }

        int numSearch;
        System.out.print("Enter the number you are looking for: ");
        numSearch = scanner.nextInt();

        for (int i=0; i<indexNum; i++){
            if (numSearch != storeNum[i]){
                continue;
            }
            else {
                System.out.println("Located at index number: " + i);
            }
        }


    }
}