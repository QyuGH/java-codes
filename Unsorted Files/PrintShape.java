import java.util.Scanner;

public class PrintShape {

    public static void printRectangle(int height, int width){
        for (int i = 1; i <= height; i++){
                for (int j = 1; j <= width; j++){
                    System.out.print("* ");
                }
                System.out.println();
        }            
    }

    public static void printSquare(int area){
        for (int i = 1; i <= area; i++){
            for (int j = 1; j <= area; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int height){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height - i; j++){
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

        System.out.println("Input the number of the shape you want to print: ");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Square");
        System.out.println("(3) Triangle");
        int choice = scanner.nextInt();

        switch(choice){
            case 1: 
                System.out.print("Input the height the of the rectangle: ");
                int rectangleHeight = scanner.nextInt();
                System.out.print("Input the width of the rectangle: ");
                int rectangleWidth = scanner.nextInt();
                printRectangle(rectangleHeight, rectangleWidth);
                break;
            case 2:
                System.out.print("Input the side length of the square: ");
                int length = scanner.nextInt();
                printSquare(length);
                break;
            case 3: 
                System.out.print("Input the height of the triangle: ");
                int triangleHeight = scanner.nextInt();
                printTriangle(triangleHeight);
                break;
            default: 
                break;
        }

        scanner.close();
        
    }
}
