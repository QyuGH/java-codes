import java.util.Scanner;

public class Shape {

    
    public static void printRectangle(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquare(){
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5 - i; j++){
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

        printRectangle();
        printSquare();
        printTriangle();

        scanner.close();
    }
}
