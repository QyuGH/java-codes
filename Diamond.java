import java.util.Scanner;

public class Diamond{

    public static void printDiamond(int num){
        for (int i = 1; i <= num; i++){

            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--){
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        printDiamond(height);
    }
}