public class Fibbonacci {
    public static void printFibbonacci(){
        int first = 0; 
        int second = 1;

        System.out.println(first);
        System.out.println(second);
        for (int i = 1; i <= 10; i++){
            int temp = first + second;
            System.out.println(temp);
            first = second;
            second = temp;
        }
    }

    public static void main(String[] args){
        printFibbonacci();
    }
}
