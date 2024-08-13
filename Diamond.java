
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

        for (int i = 1; i < num; i++){
            
        }

    }
    public static void main(String[] args){
        printDiamond(5);
    }
}