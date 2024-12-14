import java.util.*;

public class MyArrayList {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        System.out.print("Enter size of the list: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + i + ": ");
            int num = scanner.nextInt();
            if (!number.contains(num)){
                number.add(num);
            }
        }

        Collections.sort(number);
        System.out.println(number);
    }
}
